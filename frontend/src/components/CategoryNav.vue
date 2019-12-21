<template>
  <div class="category_nav">
    <div class="px-35px pt-35px pb-0">
      <ul class="m-0 p-0 list-none">
        <li class="m-0 p-0 relative" v-for="(subCatInfo, priCat) in categoryInfo" :key="priCat">
          <div class="border-b border-solid border-appleGray-400">
            <div class="px-8px pt-8px pb-10px">
              <button class="category_nav__primary_cat" tabindex="0" @click.prevent="subCatInfo['isOn'] = !subCatInfo['isOn']">
                <span class="category_nav__primary_cat_title" v-text="priCat"></span>
                <span class="category_nav__icon--close fas fa-times"></span>
              </button>
            </div>
            <div :class="[subCatInfo['isOn'] ? ['category_nav__sub_cat_list_wrap--on'] : ['category_nav__sub_cat_list_wrap--off']]" tabindex="0">
              <ul class="m-0 p-0 list-none">
                <li class="my-3px mx-0 py-2px px-8px text-1em" v-for="(subCats, index) in subCatInfo['subCategory']" :key="index">
                  <a class="category_nav__sub_cat_wrap" aria-disabled="false" role="checkbox" aria-checked="false" tabindex="0">
                    <span class="block leading-moreTight -ml-px">
                      <span class="category_nav__sub_cat" v-text="subCats"></span>
                    </span>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Vue,
  Component,
} from 'vue-property-decorator';

@Component
export default class CategoryNav extends Vue {
  private categoryInfo: object = {
    '음식': {
      primaryCategory: '음식',
      subCategory: ['중식', '한식', '양식', '일식'],
      isOn: false,
    },
    '미술&사진': {
      primaryCategory: '미술&사진',
      subCategory: ['그림', '사진'],
      isOn: false,
    },
    '아동': {
      primaryCategory: '아동',
      subCategory: ['동화', '그림책', '퍼즐'],
      isOn: false,
    },
    '역사': {
      primaryCategory: '역사',
      subCategory: ['세계사', '국사'],
      isOn: false,
    },
    '법': {
      primaryCategory: '법',
      subCategory: ['형법', '민법', '로스쿨', '실생활'],
      isOn: false,
    },
    '10대': {
      primaryCategory: '10대',
      subCategory: ['교과서', '만화', '대학입시', '라이트노벨'],
      isOn: false,
    },
    '문학': {
      primaryCategory: '문학',
      subCategory: ['시', '소설', '수필', '희곡', '평론'],
      isOn: false,
    },
  };
}
</script>

<style lang="scss" scoped>
  @mixin category_nav__primary_cat_common {
    letter-spacing: 0;
    font-size: 14px;
    line-height: 1.5;
    display: table-cell;
    vertical-align: middle;
  }

  @mixin focus_category {
    border-color: #0070c9;
    outline: none;
    box-shadow: 0 0 0 .25rem rgba(131,192,253,.5);
  }

  .category_nav {
    position: relative;
    width: 238px;
    margin: 0;
    padding: 0;
    float: left;
    color: #333;
  }

  .category_nav__primary_cat {
    display: block;
    width: 100%;
    text-align: left;
    box-sizing: content-box;
    margin: 0;
    padding: 0;
    &:focus {
      @include focus_category;
    }
  }

  .category_nav__primary_cat_title {
    font-weight: 800;
    width: 100%;
    @include category_nav__primary_cat_common;
  }

  .category_nav__icon--close {
    color: #888;
    padding: 0;
    @include category_nav__primary_cat_common;
  }

  .category_nav__sub_cat_list_wrap--on {
    padding-bottom: 20px;
    display: block;
    opacity: 1;
  }

  .category_nav__sub_cat_list_wrap--off {
    height: 0;
    padding-bottom: 20px;
    opacity: 0;
    display: none;
  }

  .category_nav__sub_cat_wrap {
    display: block;
    color: #0070c9;
    cursor: pointer;
    text-decoration: none;
    &:focus {
      @include focus_category;
    }
  }

  .category_nav__sub_cat {
    letter-spacing: 0;
    font-size: 14px;
    line-height: 1.5;
    font-weight: 400;
    color: #333;
  }
</style>
