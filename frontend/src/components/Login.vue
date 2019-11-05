<template>
  <div class="px-10 py-10">
    <form class="w-full max-w-sm">
      <div class="">
        <label class="block text-black text-4xl font-bold text-left mb-1 pr-4 pb-8" for="inline-username">
          로그인.
        </label>
      </div>
      <div class="mb-3">
        <div class="">
          <input class="appearance-none border border-gray-400 rounded w-full h-12 py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline focus:border-blue-700" id="inline-full-name" type="text" placeholder="NiShopping ID">
        </div>
      </div>
      <div class="mb-10">
        <div class="">
          <input class="appearance-none border border-gray-400 rounded w-full h-12 py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline focus:border-blue-700" id="inline-username" type="password" placeholder="암호">
        </div>
      </div>
      <div class="mb-4">
        <button class="shadow w-full h-12 bg-blue-500 hover:bg-blue-400 focus:shadow-outline focus:outline-none text-white font-normal py-2 px-4 rounded" type="button">
          로그인
        </button>
      </div>
      <a class="inline-block align-baseline font-medium text-sm text-blue-700 hover:text-blue-500" href="#">
        NiShopping ID 없으신가요? 지금 생성.
      </a>
    </form>
  </div>
</template>

<script lang="ts">
  import { Component, Vue } from 'vue-property-decorator';

  @Component
  export default class Login extends Vue {}
</script>

<style>

</style>
