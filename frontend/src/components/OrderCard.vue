<template>
  <div class="ordercard min-w-md w-full flex border-b border-solid border-appleGray-400 mb-12 pb-12">
    <img class="h-auto w-48 flex-none object-contain rounded text-center overflow-hidden" src="../assets/img/testbook.jpg">
    <div class="bg-white p-4 flex flex-col justify-between leading-normal w-full">
      <div class="flex flex-wrap font-semibold text-xl">
        <div class="pr-2 ordercard__top--boxsizing_border w-7/12">
          <h2>
            <a href="">제품 이름</a>
          </h2>
        </div>
        <div class="w-2/12">
          <div class="pl-2 -mt-1">
            <div class="select inline-block relative">
              <select class="w-8 border-0 p-0 mb-0 bg-transparent" value="1" aria-label="수량" ref="myselect">
                <option value="1" selected="true">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
              </select>
              <span class="icon select__icon fas fa-chevron-down" aria-hidden="true">
              </span>
            </div>
          </div>
        </div>
        <div class="w-3/12">
          <div>
            <p class="pl-1 text-right">
              <span>65,000원</span>
            </p>
          </div>
          <div class="mt-3 text-right">
            <button class="text-sm font-normal text-appleBlue bg-transparent border-0 p-0 hover:underline">
              <span>삭제</span>
            </button>
          </div>
        </div>
      </div>
      <div class="mt-5 pt-5 border-t border-solid border-appleGray-400">
        <div class="relative">
          <div class="mr-5 font-normal text-sm w-5/12">
            <div class="mr-3 absolute w-5 h-5">
              <img src="../assets/img/shipping.svg" class="block w-full h-full">
            </div>
            <div class="ml-6 block">
              <span class="font-semibold text-sm block">오늘 오후 3:00 까지 주문 시:배송</span>
              <span class="text-xs font-normal block">익일 - 무료 배송</span>
              <span class="text-xs font-normal block">
                배송 옵션 :
                <button class="bg-transparent border-0 text-appleBlue p-0 text-left">
                  <span class="hidden">
                    입력하신 우편번호의 배송 옵션 보
                  </span>
                  <span>12345</span>
                  <span aria-hidden="true" class="fas fa-chevron-down"></span>
                  <span></span>
                </button>
              </span>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import { Component, Vue } from 'vue-property-decorator';

  @Component
  export default class OrderCard extends Vue {
  }
</script>

<style scoped>
  @import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css');

  .ordercard__top--boxsizing_border {
    box-sizing: border-box;
  }

  select {
    /* for Firefox */
    -moz-appearance: none;
    /* for Chrome */
    -webkit-appearance: none;
  }

  /* For IE10 */
  select::-ms-expand {
    display: none;
  }

  .select__icon {
    display: block;
    position: absolute;
    line-height: 1.25;
    color: #0070c9;
    top: 7px;
    right: 0;
    font-size: 16px;
  }

  .icon:before {
    display: inline-block;
    z-index: 1;
    position: relative;
  }
</style>
