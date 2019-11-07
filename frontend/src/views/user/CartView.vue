<template>
  <div id="cartView">
    <div class="nav">
      <!--<NavBar />-->
    </div>
    <div class="main">
      <div class="main__grid">

        <section class="flex main__title content-center rounded shadow-md">
          1
        </section>

        <section class="main__contents border rounded-lg flex shadow-md">
          2
        </section>

      </div>
    </div>
    <div class="footer">
      ------footer------
    </div>
  </div>
</template>

<script>
  import {
    Component,
    Vue,
  } from 'vue-property-decorator';
  import NavBar from '../../components/NavBar.vue';

  @Component({
    components: {
      NavBar,
    }
  })
  export default class CartView extends Vue {

  }
</script>

<style scoped>

</style>