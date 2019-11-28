<template>
  <div id="likeView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <section class="flex main__title content-center rounded border-b">
        <div class="main__title--grid content-center">
          <div class="flex flex-wrap content-center main_title--banner w-full">
            <div class="w-full">
              <div class="text-center text-4xl font-extrabold">찜 목록</div>
            </div>
          </div>
          <div class="flex justify-between main__grid">
            <div class="main__title--btn text-xs">
              필터
            </div>
            <div class="main__title--btn text-xs">
              편집
            </div>
          </div>
        </div>
      </section>
      <div class="main__grid">
        <section class="main__like">
          <div class="flex flex-wrap mb-4 font-light">
            <div class="w-1/3 my-8">
              <div class="text-center py-2 text-xs text-orange-600">
                상품 특이 사항
              </div>
              <div class="text-center mx-4">
                <div class="">
                  상품 이름
                </div>
              </div>
              <div class="text-center py-2 px-4 mx-4">
                <div class="border-b">
                  상품 가격
                </div>
              </div>
              <div class="main__like--img flex content-center flex-wrap">
                <div class="">
                  <img class="main__products--img">
                </div>
              </div>
            </div>
          </div>
        </section>

      </div>
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
import NavBar from '../../components/NavBar.vue';
import Footer from '../../components/Footer.vue';

@Component({
  components: {
    NavBar,
    Footer,
  },
})
export default class LikeView extends Vue {

}
</script>

<style scoped>
#infoView {
  color:rgb(17, 17, 17);
  min-width: 768px;
}
.main__grid {
  margin: 0 auto;
  min-width: 768px;
  max-width: 1024px;
  width: 100%
}
.main__title {
  min-width: 100%;
}
.main__title--grid {
  min-width: 100%;
  margin-bottom: 8px;
}
.main__title--btn {
  color: #888;
}
.main_title--banner {
  height: 177px;
}
.main__like--img {
  min-height: 300px;
}
.main__products--img {
  object-fit: cover;
  content:url("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MWU22?wid=800&hei=800&fmt=jpeg&qlt=80&op_usm=0.5,1.5&fit=constrain&.v=1566949271552");
}
</style>
