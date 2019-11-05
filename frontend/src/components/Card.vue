<template>
  <div class="max-w-sm rounded overflow-hidden shadow-lg">
    <img class="w-full object-cover" src="../assets/img/testbook.jpg">
    <div class="px-6 py-1">
      <div class="font-bold text-xl mb-1">The Coldest Sunset</div>
    </div>
    <div class="px-3 py-1">
      <span class="inline-block bg-gray-200 rounded-full px-3 py-1 text-xs font-semibold text-gray-700 mr-2 mb-1">#photography</span>
      <span class="inline-block bg-gray-200 rounded-full px-3 py-1 text-xs font-semibold text-gray-700 mr-2 mb-1">#travel</span>
      <span class="inline-block bg-gray-200 rounded-full px-3 py-1 text-xs font-semibold text-gray-700 mr-2 mb-1">#winter</span>
    </div>
  </div>
</template>

<script lang="ts">
  import { Component, Vue } from 'vue-property-decorator';

  @Component
  export default class Card extends Vue {
  }
</script>

<style scoped>

</style>
