<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import MainView from './views/MainView.vue';

@Component({
  components: {
    MainView,
  },
})
export default class App extends Vue {}
</script>

<style>

</style>
