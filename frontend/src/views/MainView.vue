<template>
  <div id="mainView">
    <div class="nav">
      <NavBar />
    </div>

    <div class="main bg-gray-300">
      <section class="main__banner">
        <div>
          <img class="main__banner--img">
        </div>
      </section>

      <section class="main__product">
        <div class="centerGridSize">
          <div class="main__product--grid">
            <div class="text-xl font-semibold py-2 border-b">상품 카테고리 이름</div>
            <div class="flex justify-around">
              <div class="main__product--stuff">
                <Card />
              </div>
              <div class="main__product--stuff">
                <Card />
              </div>
              <div class="main__product--stuff text-gray-700 text-center">
                <Card />
              </div>
            </div>

            <div class="text-xl font-semibold py-2 border-b">상품 카테고리 이름</div>
            <div class="flex justify-around">
              <div class="main__product--stuff">
                <Card />
              </div>
              <div class="main__product--stuff">
                <Card />
              </div>
              <div class="main__product--stuff text-gray-700 text-center">
                <Card />
              </div>
            </div>
            
          </div>
        </div>
      </section>
    </div>

    <div class="footer">
      <Footer/>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Component,
  Vue,
} from 'vue-property-decorator';
import NavBar from '../components/NavBar.vue';
import Footer from '../components/Footer.vue';
import Card from '../components/Card.vue';

@Component({
  components: {
    NavBar,
    Footer,
    Card,
  },
})
export default class MainView extends Vue {

}
</script>

<style scoped>
  #mainView {
    color: rgb(17, 17, 17);
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
  .main__banner {
    margin-bottom: 40px;
  }
  .main__banner--img {
    object-fit: cover;
    width: 100%;
    max-height: 500px;
    content:url("https://images.wallpaperscraft.com/image/book_table_sheets_pages_light_44458_1920x1080.jpg");
  }
  .main__product {
    text-align: center;
  }
  .main__product--grid {
    margin: 6px 0 6px 0;
    width: 100%;
  }
  .main__product--stuff {
    margin: 10px 0 10px 0;
    min-height: 340px;
    max-height: 400px;
    height: 40vw;
    width: 30%;
    cursor: pointer;
  }
</style>
