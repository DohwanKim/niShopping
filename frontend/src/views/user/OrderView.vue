<template>
  <div id="orderView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <div class="main__grid">
        <section class="flex main__title content-center rounded">
          <div class="main__title--grid content-center">
            <div class="flex flex-wrap content-end main__title--banner w-full">
              <div class="w-full">
                <div class="text-4xl font-extrabold">주문 하신 목록</div>
              </div>
            </div>
          </div>
        </section>
        <section class="main__order">
          <div class="flex flex-wrap mb-4 font-light">
            <div class="main__order--grid w-1/3 my-8 border">
              <div class="flex justify-center main__order--img-grid">
                <img class="main__order--img self-center">
              </div>
              <div class="text-center px-4 mx-4">
                <div class="border-b py-2 text-xs">
                  상품 이름
                </div>
              </div>
              <div class="text-center mx-4">
                <div class="py-2 font-semibold text-xl">
                  배송 출발 날짜
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
    </div>
    <div class="footer">
      ------footer------
    </div>
  </div>
</template>

<script lang="ts">
import {
  Component,
  Vue,
} from 'vue-property-decorator';
import NavBar from '../../components/NavBar.vue';

@Component({
  components: {
    NavBar,
  },
})
export default class OrderView extends Vue {

}
</script>

<style scoped>
#orderView {
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
.main__title--banner {
  height: 130px;
}
.main__order--grid {
  max-width: 320px;
  margin: 20px 6px 20px 6px;
  min-height: 400px;
}
.main__order--img-grid {
  min-height: 300px;
}
.main__order--img {
  max-width: 200px;
  max-height: 200px;
  object-fit: cover;
  content:url("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MWU22?wid=800&hei=800&fmt=jpeg&qlt=80&op_usm=0.5,1.5&fit=constrain&.v=1566949271552");
}
</style>
