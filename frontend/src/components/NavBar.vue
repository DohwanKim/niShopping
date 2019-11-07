<template>
  <div id="nav" class="relative min-w-md">
    <nav class="flex items-center justify-between flex-wrap bg-appleBlack p-3">
      <div id="logo" class="flex items-center flex-shrink-0 text-white mr-6 pr-6">
        <svg class="fill-current h-8 w-8 mr-2" width="54" height="54" viewBox="0 0 54 54" xmlns="http://www.w3.org/2000/svg"><path d="M13.5 22.1c1.8-7.2 6.3-10.8 13.5-10.8 10.8 0 12.15 8.1 17.55 9.45 3.6.9 6.75-.45 9.45-4.05-1.8 7.2-6.3 10.8-13.5 10.8-10.8 0-12.15-8.1-17.55-9.45-3.6-.9-6.75.45-9.45 4.05zM0 38.3c1.8-7.2 6.3-10.8 13.5-10.8 10.8 0 12.15 8.1 17.55 9.45 3.6.9 6.75-.45 9.45-4.05-1.8 7.2-6.3 10.8-13.5 10.8-10.8 0-12.15-8.1-17.55-9.45-3.6-.9-6.75.45-9.45 4.05z"/></svg>
        <span class="font-semibold text-xl tracking-tight">NiShopping</span>
      </div>
      <div class="block flex-grow flex items-center w-auto">

        <button v-if="!isClickSearch" @click.prevent="isClickSearch = true" class="fixed inset-0 h-full w-full cursor-default"></button>
        <div id="searchfield" v-if="!isClickSearch" class="absolute w-3/5">
          <div class="container mx-auto py-4 rounded">
            <input type="search" placeholder="Search..." autofocus="autofocus" class="w-full bg-appleBlack text-white placeholder-white transition focus:outline-none focus:border-transparent p-2 appearance-none leading-normal text-xl lg:text-2xl">
          </div>
        </div>

        <div class="text-sm flex-grow">
          <a href="#responsive-header" v-if="isClickSearch" class="px-6 inline-block mt-0 text-white hover:text-white mr-4">
            메뉴1
          </a>
          <a href="#responsive-header" v-if="isClickSearch" class="px-6 inline-block mt-0 text-white hover:text-white mr-4">
            메뉴2
          </a>
          <a href="#responsive-header" v-if="isClickSearch" class="px-6 inline-block mt-0 text-white hover:text-white">
            고객 센터
          </a>
          <div id="search-toggle" class="search-icon cursor-pointer px-6 inline-block" @click.prevent="isClickSearch = !isClickSearch">
            <svg class="fill-current pointer-events-none text-white w-4 h-4 inline" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20">
              <path d="M12.9 14.32a8 8 0 1 1 1.41-1.41l5.35 5.33-1.42 1.42-5.33-5.34zM8 14A6 6 0 1 0 8 2a6 6 0 0 0 0 12z"></path>
            </svg>
          </div>
        </div>
        <!--        <div>-->
        <!--          <a href="#" class="inline-block text-sm px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-black hover:bg-white mt-4 lg:mt-0">Download</a>-->
        <!--        </div>-->
      </div>
      <DropDown />
    </nav>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import DropDown from './DropDown.vue';

@Component({
  components: {
    DropDown,
  },
})
export default class NavBar extends Vue {
  isClickSearch:boolean= true
}
</script>

<style>
  .nav {
    min-width: 768px;
  }

</style>
