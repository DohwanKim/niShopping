<template>
  <div id="detailProductView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="category border-b border-solid border-appleGray-400 text-xs leading-relaxed font-normal tracking-wider relative top-0 left-0 bg-transparent not-italic z-9997">
      <div class="">
        <nav class="w-full border-b-0 pt-2 relative my-0 mx-auto block">
          <div class="min-w-md w-11/12 mx-auto relative z-2">
            <a class="mt-6px mb-15px mx-0 p-0 text-appleBlack block float-left h-5 bg-left-top bg-no-repeat text-2xl leading-tight font-medium tracking-normal cursor-auto ">상위 카테고리</a>
          </div>

          <input type="checkbox" id="localnav-disclosure" class="hidden absolute h-1 w-1 p-0 border-0 overflow-hidden">

          <div class="border-b-0 min-w-md h-12 w-11/12 mx-auto relative z-1">
            <label id="localNav" @click.prevent="isClickLocalNav = !isClickLocalNav" for="localnav-disclosure" class="top-10px p-0 overflow-visible block relative outline-none float-right left-m2px border-0 cursor-pointer bg-transparent leading-loose">
              <span class="outline-none py-12px text-appleBlack hover:opacity-60">
                <span class="mr-6px">모두 검색</span>
                <span v-if="!isClickLocalNav" class="fas fa-chevron-down" aria-hidden="true" role="button" tabindex="0" aria-controls="localnav-tray" :aria-expanded="isClickLocalNav"></span>
                <span v-else class="fas fa-chevron-up"></span>
              </span>
            </label>
          </div>

          <div class="-z-1 w-full absolute left-0 overflow-hidden pointer-events-none" :class="[isClickLocalNav ? ['top-0', 'pointer-events-auto'] : ['-top-46px', 'pointer-events-none'] ]" :aria-hidden="isClickLocalNav">
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
    <div class="contentContainer">
      <div class="content">
        <div class="column">
          <div class="displayArea">
            <div id="title"></div>
            <div id="section"></div>
            <div id="question"></div>
          </div>
        </div>
        <div class="column"></div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Component,
  Vue,
} from 'vue-property-decorator';
import NavBar from '../../components/NavBar.vue';

@Component({
  components: {
    NavBar,
  },
})
export default class DetailProductView extends Vue {
  isClickLocalNav:boolean= false;
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
