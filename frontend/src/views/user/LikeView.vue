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
            <LikeCard />
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
import LikeCard from '../../components/LikeCard.vue';

@Component({
  components: {
    NavBar,
    Footer,
    LikeCard,
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
</style>
