<template>
  <div class="accountcard border-2 w-1/2 border-solid border-gray-400 px-5 py-6 bg-white rounded-sm">
    <div class="accountcard__header relative h-auto">
      <h2 class="text-xl font-bold">테스트</h2>
      <a v-if="!isClickHelpLink" @click.prevent="isClickHelpLink = !isClickHelpLink" class="absolute top-0 right-0 p-1 cursor-pointer">
        <img src="../assets/img/cheveron-outline-down.svg" alt="can't show image" class="w-4 h-4 inline-block">
      </a>
      <a v-if="isClickHelpLink" @click.prevent="isClickHelpLink = false" class="absolute top-0 right-0 p-1 cursor-pointer">
        <img src="../assets/img/cheveron-outline-up.svg" alt="can't show image" class="w-4 h-4 inline-block">
      </a>
      <p v-if="isClickHelpLink"><em>NiShopping</em> description about this card</p>
    </div>
    <div class="accountcard__content pt-2 h-32">
      <p class="pt-3">주문사항을 추적 할 수 있습니다.</p>
    </div>
    <p class="accountcard__btnarea pl-1">
      <button class="bg-transparent hover:bg-appleBlack text-appleBlack font-semibold hover:text-white py-1 px-3 border border-appleBlack hover:border-transparent rounded-sm">
        Button
      </button>
    </p>
  </div>
</template>

<script lang="ts">
import { Vue, Component } from 'vue-property-decorator';

@Component
export default class AccountCard extends Vue {
  isClickHelpLink:boolean = false;
}
</script>

<style scoped>

</style>
