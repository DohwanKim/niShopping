<template>
  <div class="relative z-9999" @mouseleave.prevent="isClickMenu = false">
    <div v-if="isClickMenu" class="absolute h-10 w-10 top-0 left-0"></div>
    <button class="flex items-center px-3 py-2 border rounded text-white border-white hover:text-white hover:border-white" @click.prevent="isClickMenu = !isClickMenu">
      <svg class="fill-current h-3 w-3" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><title>Menu</title><path d="M0 3h20v2H0V3zm0 6h20v2H0V9zm0 6h20v2H0v-2z"/></svg>
    </button>
    <div v-if="isClickMenu" class="absolute right-0 mt-2 py-2 w-48 bg-white rounded-lg shadow-xl" @mouseleave.prevent="isClickMenu = false">
      <div class="block px-4 py-2 text-gray-800 hover:bg-indigo-500 hover:text-white" @click.prevent="signIn">로그인</div>
      <div class="block px-4 py-2 text-gray-800 hover:bg-indigo-500 hover:text-white">계정</div>
      <div class="block px-4 py-2 text-gray-800 hover:bg-indigo-500 hover:text-white">장바구니</div>
      <div class="block px-4 py-2 text-gray-800 hover:bg-indigo-500 hover:text-white" @click.prevent="signOut">로그아웃</div>
    </div>
  </div>
</template>

<script lang="ts">
  import AuthService from '../service/AuthService';
  import {
    Vue,
    Prop,
    Component,

  } from 'vue-property-decorator';

  @Component
  export default class DropDown extends Vue {
    isClickMenu:boolean = false
    authService = new AuthService();

    signIn(){
      this.authService.signIn();
    }

    signOut(){
      this.authService.signOut();
    }
  }

</script>

<style>

</style>
