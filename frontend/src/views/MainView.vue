<template>
  <div id="mainView">
    <div class="nav">
      <NavBar />
    </div>

    <div class="main bg-gray-300">
      <section class="main__banner">
        <div class="main__banner--space">
          <img class="main__banner--img" src="https://images.wallpaperscraft.com/image/book_table_sheets_pages_light_44458_1920x1080.jpg">
        </div>
      </section>

      <section class="main__product">
        <div class="centerGridSize border-0">
          <div class="main__product--grid border">
            <!-- 카테고리 별 상품 컴포넌트 -->
            <div class="">상품 카테고리 이름</div>
            <div class="main__product--component flex justify-around">
              <!-- 각 상품 컴포넌트 -->
              <div class="main__product--component--stuff text-gray-700 text-center bg-gray-400">
                1
              </div>
              <div class="main__product--component--stuff text-gray-700 text-center bg-gray-400">
                2
              </div>
              <div class="main__product--component--stuff text-gray-700 text-center bg-gray-400">
                3
              </div>
            </div>
            <div class="">상품 카테고리 이름</div>
            <div class="main__product--component flex justify-around">
              <div class="main__product--component--stuff text-gray-700 text-center bg-gray-400">
                1
              </div>
              <div class="main__product--component--stuff text-gray-700 text-center bg-gray-400">
                2
              </div>
              <div class="main__product--component--stuff text-gray-700 text-center bg-gray-400">
                3
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>

    <div class="footer">
      <div class="bg-gray-600">
        ------------푸터-------------
      </div>
    </div>
  </div>
</template>

<script lang="ts">
  import {
    Component,
    Vue,
  } from 'vue-property-decorator';
  import NavBar from '../components/NavBar.vue';

  @Component({
    components: {
      NavBar,
    }
  })
  export default class MainView extends Vue {

  }
</script>

<style scoped>
  #mainView {
    height: 100%;
    width: 100%;
  }
  .centerGridSize {
    margin: 0 auto;
    min-width: 768px;
    max-width: 1024px;
    width: 100%
  }
  .main {
    min-width: 768px;
  }
  .main__banner{
  }
  .main__banner--space{

  }
  .main__banner--img {
    object-fit: cover;
    width: 100%;
    max-height: 500px;
  }
  .main__product {
    text-align: center;
  }
  .main__product--grid {
    margin: 6px 0 6px 0;
    width: 100%;
  }
  .main__product--component {
  }
  .main__product--component--stuff {
    margin: 10px 0 10px 0;
    min-height: 340px;
    max-height: 400px;
    height: 40vw;
    width: 30%;
    cursor: pointer;
  }
</style>
