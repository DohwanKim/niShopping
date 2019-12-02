<template>
  <div class="max-w-sm rounded overflow-hidden shadow-lg">
    <img class="w-full object-cover" src="../assets/img/testbook.jpg">
    <div class="px-6 py-1">
      <div class="font-bold text-xl mb-1">The Coldest Sunset</div>
    </div>
    <div class="description px-3 py-1">
      <span class="description__text">#photography</span>
      <span class="description__text">#travel</span>
      <span class="description__text">#winter</span>
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
  .description__text {
    display: inline-block;
    background-color: #edf2f7;
    border-radius: 9999px;
    padding: 4px 12px;
    font-size: 12px;
    font-weight: 600;
    color: #4a5568;
    margin-right: 8px;
    margin-bottom: 4px;
  }
</style>
