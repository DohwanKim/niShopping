<template>
  <div id="detailProductView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="category min-w-md border-b border-solid border-appleGray-400 text-xs leading-relaxed font-normal tracking-wider relative top-0 left-0 bg-transparent not-italic z-9997">
      <div class="">
        <nav class="w-full border-b-0 pt-2 relative my-0 mx-auto block">
          <div class="min-w-md w-11/12 mx-auto relative z-2">
            <a class="mt-6px mb-15px mx-0 p-0 text-appleBlack block float-left h-5 bg-left-top bg-no-repeat text-2xl leading-tight font-medium tracking-normal cursor-auto ">상위 카테고리</a>
          </div>

          <input type="checkbox" id="localnav-disclosure" class="hidden absolute h-1 w-1 p-0 border-0 overflow-hidden">

          <div class="border-b-0 h-12 w-11/12 mx-auto relative z-1">
            <label id="localNav" @click.prevent="isClickLocalNav = !isClickLocalNav" for="localnav-disclosure" class="top-10px p-0 overflow-visible block relative outline-none float-right left-m2px border-0 cursor-pointer bg-transparent leading-loose">
              <span class="outline-none py-12px text-appleBlack hover:opacity-60">
                <span class="mr-6px">모두 검색</span>
                <span v-if="!isClickLocalNav" class="fas fa-chevron-down" aria-hidden="true" role="button" tabindex="0" aria-controls="localnav-tray" :aria-expanded="[isClickLocalNav]"></span>
                <span v-else class="fas fa-chevron-up"></span>
              </span>
            </label>
          </div>

          <div class="-z-1 w-full absolute left-0 overflow-hidden pointer-events-none" :class="[isClickLocalNav ? ['top-0', 'pointer-events-auto'] : ['-top-46px', 'pointer-events-none'] ]" :aria-hidden="[isClickLocalNav]">
            <div class="my-0 mx-auto relative overflow-hidden boxsizing_borderbox" :class="[isClickLocalNav ? ['pt-58px', 'border-b', 'border-solid','border-appleGray-400','w-full','bg-white','pointer-events-auto'] : ['pt-98px', 'border-b-0','bg-transparent','pointer-events-none','w-11/12']]">
              <div class="h-auto w-full min-w-md tracking-normal leading-normal font-normal text-sm mx-auto mt-0 mb-12 pt-6 relative z-1 max-w-980px">
                <div class="w-1/4 boxsizing_borderbox relative z-1 m-0 p-0 float-left">
                  <div class="py-px px-0">
                    <div class="tracking-normal text-sm leading-normal font-semibold m-0 relative top-1px" :class="[isClickLocalNav ? ['opacity-100', 'pointer-events-auto'] : ['opacity-0', 'pointer-events-none']]">제품별로 쇼핑하기</div>
                    <ul class="w-full h-auto pl-10px p-0 mt-1 mr-0 -mb-1 -ml-2 overflow-hidden text-center float-none" :class="[isClickLocalNav ? ['min-w-full','max-w-full'] : []]">
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-full'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-full'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-full'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-full'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-full'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                    </ul>
                  </div>
                </div>
                <div class="w-3/4 boxsizing_borderbox relative z-1 m-0 p-0 float-left">
                  <div class="border-l border-solid -ml-3.26% pl-3.26% py-px px-0" :class="[isClickLocalNav ? ['border-appleGray-400'] : ['border-transparent']]">
                    <div class="tracking-normal text-sm leading-normal font-semibold m-0 relative top-1px" :class="[isClickLocalNav ? ['opacity-100', 'pointer-events-auto'] : ['opacity-0', 'pointer-events-none']]">카테고리별로 쇼핑하기</div>
                    <ul class="w-full h-43 max-h-111 pl-10px p-0 mt-1 mr-0 -mb-1 -ml-2 overflow-hidden text-center float-none flex flex-col flex-wrap content-start justify-start" :class="[isClickLocalNav ? ['min-w-full','max-w-full'] : []]">
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                      <li class="m-0 float-left pr-4 p-0 h-8 leading-moreLoose boxsizing_borderbox text-left relative z-1" :class="[isClickLocalNav ? ['w-1/3'] : ['w-48']]">
                        <a class="boxsizing_borderbox max-w-full p-0 mb-1 m-0 align-bottom leading-normal font-normal text-center text-appleBlack inline-block" :class="[isClickLocalNav ? ['opacity-100','pointer-events-auto','tracking-normal','overflow-hidden','text-sm','whitespace-no-wrap','txtoverflow'] : ['opacity-0','pointer-events-none','text-xs','tracking-wide','whitespace-normal']]" href="">test</a>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </nav>
      </div>
    </div>
    <div role="main" id="main">
      <div class="main__content">
        <div class="mx-auto w-full max-w-980px min-w-md z-1 relative ">
          <div class="column w-4/12 boxsizing_borderbox relative z-1 m-0 p-0 float-left">
            <div class="pt-15 pb-10">
              <div id="optionalDescription" class="-mt-1">
                <span class="mb-4 tracking-normal text-lg font-normal leading-normal block text-orange">New</span>
              </div>
              <div id="title" class="-mr-1">
                <h1 itemprop="name" class="text-3.5xl leading-none font-medium block opacity-100 m-0 p-0">{{ productInfo.name }}</h1>
              </div>
              <div>
                <div class="text-xs leading-normal font-normal tracking-normal">
                  <ul class="m-0 p-0">
                    <li class="flex tracking-normal pb-10px p-0 mt-6px m-0 text-base leading-normal font-normal inline-block text-appleBlack">
                      <span>{{ productInfo.price }}</span>
                    </li>
                    <li class="flex tracking-normal pb-10px p-0 mt-6px m-0 text-base leading-normal font-normal inline-block text-appleBlack">
                      <span>{{ productInfo.score }}</span>
                    </li>
                    <li class="flex tracking-normal pb-10px p-0 mt-6px m-0 text-base leading-normal font-normal inline-block text-appleBlack">
                      <span>{{ productInfo.author }}</span>
                    </li>
                    <li class="flex tracking-normal pb-10px p-0 mt-6px m-0 text-base leading-normal font-normal inline-block text-appleBlack">
                      <span>{{ productInfo.publisher }}</span>
                    </li>
                    <li class="m-0 p-0">
                      <div class="pt-5">
                        <fieldset class="border-0 m-0 p-0">
                          <legend class="tracking-normal text-lg leading-normal font-normal m-0 p-0">
                            일단 만든것
                            <span id="selectedText"> - type</span>
                          </legend>
                          <ul class="pl-0 border-t-0 pt-2 p-0 w-full list-none my-0 -mx-0.5">
                            <li class="mt-0 ml-0 mr-2 mb-1 p-0 float-left ">
                              <input id="type1" type="radio" class="absolute -left-9999px text-left m-0 p-0">
                              <label for="type1" class="mb-0 border border-solid border-transparent rounded-full boxsizing_borderbox text-appleBlack cursor-pointer float-left p-1 relative w-10 h-10 z-1">
                                <span class="rounded-full block w-8 h-8 shadow"></span>
                              </label>
                            </li>
                            <li class="mt-0 ml-0 mr-2 mb-1 p-0 float-left ">
                              <input id="type2" type="radio" class="absolute -left-9999px text-left m-0 p-0">
                              <label for="type2" class="mb-0 border border-solid border-transparent rounded-full boxsizing_borderbox text-appleBlack cursor-pointer float-left p-1 relative w-10 h-10 z-1">
                                <span class="rounded-full block w-8 h-8 shadow"></span>
                              </label>
                            </li>
                            <li class="mt-0 ml-0 mr-2 mb-1 p-0 float-left ">
                              <input id="type3" type="radio" class="absolute -left-9999px text-left m-0 p-0">
                              <label for="type3" class="mb-0 border border-solid border-transparent rounded-full boxsizing_borderbox text-appleBlack cursor-pointer float-left p-1 relative w-10 h-10 z-1">
                                <span class="rounded-full block w-8 h-8 shadow"></span>
                              </label>
                            </li>
                          </ul>
                        </fieldset>
                      </div>
                    </li>
                    <li class="pt-5 p-0 m-0 ">
                      <form id="addCart" method="post" action="" class="m-0 p-0 ">
                        <div class="w-full table">
                          <div class="table-cell">
                            <span>
                              <button @click.prevent="addMyCard" type="submit" title="장바구니에 담기" class="bg-appleBlue hover:bg-blue-600 text-white text-center font-normal m-0 py-1 px-4 border border-solid border-blue-700 rounded whitespace-no-wrap text-lg boxsizing_borderbox w-full inline-block leading-normal overflow-visible min-w-30px">
                                <span>장바구니에 담기</span>
                              </button>
                            </span>
                          </div>
                          <div class="w-10 table-cell align-middle">
                            <div class="favorite float-right right-0 relative inline-block">
                              <button @click.prevent="addMyLike" class="relative overflow-visible border-0 top-0 leading-loose w-6 h-6 text-appleBlue inline-block text-2xl text-left" aria-label="즐겨찾기에 추가" tabindex="0">
                                <span class="far fa-heart absolute overflow-hidden w-6 h-6 p-0 -mt-3">즐겨찾기에 추가</span>
                              </button>
                            </div>
                          </div>
                        </div>
                      </form>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
          <div class="column w-7/12 float-left left-1/12 relative">
            <div class="mt-12">
              <img :src="require(`../../${productInfo.image}`)" :alt="'test'">
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Component,
  Prop,
  Watch,
  Vue,
} from 'vue-property-decorator';
import NavBar from '../../components/NavBar.vue';
import { productType } from '../../types/product';
import ApiService from '../../service/apiService';

@Component({
  components: {
    NavBar,
  },
})
export default class DetailProductView extends Vue {
  @Prop(String) readonly productId: string | undefined;

  isClickLocalNav:boolean= false;

  private productInfo: productType | object = {};

  private apiService = new ApiService();

  @Watch('productId', { immediate: true })
  getProductInfo(): void {
    console.log('productId', this.productId);
    this.productInfo = {};


    /* call api through mapActions method to get only one product info */
    // this.apiService.defaultGet(`/findOneProductInfo?${this.productId}`).then((proInfo) => {
    //   this.productInfo = proInfo;
    // });

    /* test data */
    this.productInfo = {
      id: 0,
      name: 'TEST',
      price: 39000,
      salesRate: 9.9,
      promotion: 'test',
      seller: 'test',
      image: 'assets/img/testbook.jpg',
      stock: 213,
      summary: 'test',
      score: 4.5,
      release: 'test',
      translator: 'test',
      author: 'test',
      publisher: 'test',
      size: 'test',
      weight: 'test',
      pages: 213,
    };
    console.log('productInfo ', this.productInfo);
  }

  addMyCard(): void {
    /*
    * login check -> userInfo의 cart에 productId 추가
    */
  }

  addMyLike(): void {
    /*
    * login check -> userInfo의 like에 productId 추가
    */
  }
}
</script>

<style scoped>
  @import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css');

  .boxsizing_borderbox {
    box-sizing: border-box;
  }

  .txtoverflow {
    text-overflow: ellipsis;
  }
</style>
