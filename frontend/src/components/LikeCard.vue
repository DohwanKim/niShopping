<template>
  <div id="likecard text-lg font-normal text-appleBlack leading-relaxed tracking-normal bg-white text-left">
    <div class="header">
      <h1 class="header__title leading-tight tracking-normal text-5xl text-center font-semibold mx-0 mt-20 mb-11 p-0 text-gray-900">
        즐겨찾기
      </h1>
    </div>
    <div class="main">
      <div class="top-0 w-full left-0 z-100 block border-b border-solid border-appleGray-400">
        <div class="mx-auto my-0 h-10 min-w-md max-w-980px">
          <div class="float-left text-xs font-normal mt-10px m-0 pr-0 leading-normal tracking-normal text-appleGray-500">
            <button class="text-left border-0 overflow-visible m-0 p-0">
              <div>
                <span class="fas fa-list">필터</span>
              </div>
            </button>
          </div>
          <div class="leading-normal tracking-normal text-xs font-normal float-right text-appleGray-500 mt-10px m-0 pr-0">
            <span>
              <button class="text-appleGray-500 text-left border-0 overflow-visible m-0 p-0">
                <span>편집</span>
              </button>
            </span>
          </div>
        </div>
      </div>
      <div class="mx-auto min-w-md max-w-980px">
        <ol class="overflow-hidden w-full block m-0 p-0 relative z-1">
          <li class="border-b border-solid border-appleGray-400 float-left relative text-center align-top mx-auto my-0 p-0 w-1/2 z-1 ">
            <div class="w-full top-auto mt-0 pl-0 opacity-100 overflow-hidden min-h-183">
              <div class="relative z-2 w-auto h-45">
                <div class="pt-16">
                  <div>
                    <h2>
                      <a class="text-gray-900 mx-auto my-0 block text-center overflow-hidden txtoverflow_clip">
                        <div>
                          <span class="my-0 mx-auto block text-center overflow-hidden txtoverflow_clip">Product Name</span>
                          <span class="block mt-6px">₩Price</span>
                        </div>
                      </a>
                    </h2>
                  </div>
                  <div class="text-appleBlue">
                    <button class="border-0 overflow-visible m-0 p-0">
                      <span>더 알아보기</span>
                    </button>
                  </div>
                </div>
              </div>
              <div class="w-full z-1 mx-auto my-0">
                <div class="mt-12 mx-auto mb-0 text-center relative">
                  <img src="../assets/img/testbook.jpg" alt="productImg" class="border-0 w-81 h-81 my-0 mx-auto">
                </div>
              </div>
            </div>
          </li>
          <li class="border-b-0 border-l border-appleGray-400 border-solid float-left relative text-center align-top">
            <div class="w-full top-auto mt-0 pl-0 opacity-100 overflow-hidden min-h-183"></div>
          </li>
        </ol>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Vue,
  Component,
} from 'vue-property-decorator';

@Component
export default class LikeCard extends Vue {

}
</script>

<style scoped>
  @import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css');

  .boxsizing_borderbox {
    box-sizing: border-box;
  }
  .txtoverflow_clip {
    text-overflow: clip;
  }
  span:before {
    padding-right: .3em;
    display: inline-block;
    top: 0;
  }
</style>
