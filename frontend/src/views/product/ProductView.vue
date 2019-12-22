<template>
  <div id="productView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main appleBlack border-collapse">
      <section class="main__title flex content-center rounded border-b">
        <div class="main__title--grid content-center">
          <div class="flex flex-wrap w-full content-center main__title--grid--in">
            <div class="w-full">
              <div class="text-left text-xl text-appleBlack">카테고리 이름</div>
            </div>
          </div>
        </div>
      </section>
      <section class="main__banner flex justify-center">
        <div class="flex items-stretch main--inside_grid">
          <div class="main__banner--text self-center flex-1 text-2xl text-shadow">
            상위 카테고리의 하위 분류 카테고리 내용
          </div>
        </div>
      </section>

      <section class="main__product--category">
        <!--
        min-width : 1024px
        max : 100vw
        -->
        <section class="main__contents--top flex justify-center border-t border-b">
          <div class="main__contents--items flex items-stretch">
            <div class="main__contents--width self-center text-xs">
              <div class="flex justify-between">
                <div>
                  (아이콘)필터
                </div>
                <div>
                  정렬 기준: 추천 항목 (열고 닫기 항목)
                </div>
              </div>
            </div>
          </div>
        </section>

        <section class="main__contents--middle flex justify-center">
          <div class="main__contents--middle_grid flex flex-row">
<!--            <div class="main__contents&#45;&#45;nav">-->
              <CategoryNav />
<!--            </div>-->
            <div class="main__contents--products flex flex-wrap">
              <div class="w-1/3 main__contents--products-grids border-b border-l">
                상품 1
              </div>
              <div class="w-1/3 main__contents--products-grids border-b border-l">
                상품 2
              </div>
              <div class="w-1/3 main__contents--products-grids border-b border-l">
                상품 3
              </div>
              <div class="w-1/3 main__contents--products-grids border-b border-l">
                상품 4
              </div>
            </div>
          </div>
        </section>

      </section>
    </div>
    <div class="footer">
      <Footer/>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Component,
  Vue,
} from 'vue-property-decorator';
import NavBar from '../../components/NavBar.vue';
import Footer from '../../components/Footer.vue';
import CategoryNav from '../../components/CategoryNav.vue';

  @Component({
    components: {
      NavBar,
      Footer,
      CategoryNav,
    },
  })
export default class ProductView extends Vue {

}
</script>

<style lang="scss" scoped>
  #productView {
    min-width: 768px;
  }
  .dummy {
    height: 400px;
    width: 300px;
  }
  .main--inside_grid {
    height: 100%;
    width: 980px;
  }
  .main__title {
    padding-left: 16px;
    min-width: 100%;
  }
  .main__title--grid {
    min-width: 100%;
    max-width: 980px;
    margin-bottom: 8px;
  }
  .main__title--grid--in {
    padding: 10px 0 0 0;
    height: 53px;
    margin: 0 auto;
    min-width: 768px;
    max-width: 980px;
    width: 100%
  }
  .main__banner {
    padding-left: 16px;
    background: url("../../assets/banner-img/product-banner-01.png");
    height: 230px;
  }
  .main__banner--text {
    text-shadow: rgb(255, 255, 255) 1px 0 10px;
  }
  .main__contents--top {
    text-align: center;
    width: 100%;
    color: #888;
    height: 56px;
  }
  .main__product--category {
    text-align: center;
    width: 100vw;
  }
  .main__contents--items {
    padding: 0 35px 0 35px;
    width: 100%;
    min-width: 1024px;
    max-width: 1440px;
  }
  .main__contents--width {
    width: 100%;
  }
  .main__contents--middle_grid {
    min-width: 1024px;
    max-width: 1440px;
    width: 100vw;
  }
  .main__contents--nav {
    min-width: 238px;
    max-width: 238px;
    height: 500px;
    padding: 34px 35px 0 35px;
  }
  .main__contents--products {
    width: 100%;
    max-width: 1202px;
  }
  .main__contents--products-grids {
    padding: 39px 0 38px 0;
    width: 33.333%;
    min-width: 260px;
    height: 40vw;
    min-height: 438px;
    max-height: 600px;
  }
</style>
