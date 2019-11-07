<template>
  <div id="cartView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <div class="main__grid">

        <section class="flex main__title content-center">
          <div class="main_title--grid flex content-center flex-wrap">
            <div class="w-full py-2">
              <div class="text-3xl font-bold">
                장바구니에 들어 있는 제품입니다.
              </div>
            </div>
            <div class="w-full">
              <div class="text-gray-700">
                모든 주문에 무료 배송 서비스가 제공됩니다.
              </div>
            </div>
          </div>
        </section>

        <section class="main__cart">
          <div class="main__products--com border-b flex">
            <div class="w-1/4">
              <div>
                <img class="main__products--img">
              </div>
            </div>
            <div class="w-3/4">
              <div class="flex border-b text-2xl font-semibold">
                <div class="w-3/6">
                  상품 이름
                </div>
                <div class="w-1/6">
                  수량 (1)
                </div>
                <div class="w-2/6 text-right">
                  <div>
                    4달라
                  </div>
                  <div class="py-4">
                    <button class="text-blue-700 font-semibold text-xs hover:text-blue-900 py-2">
                      취소
                    </button>
                  </div>
                </div>
              </div>
              <div class="py-4 text-xl text-appleBlack">
                배송 예상 시간
              </div>
              <div class="text-appleBlack">
                오늘 주문 시, 배송:
                금 2019/11/08 - 무료 배송
              </div>
            </div>
          </div>

        </section>

        <section class="main__total border-b">
          <div class="main__total--info flex">
            <div class="w-1/4"></div>
            <div class="w-3/4 text-appleBlack">
              <div class="flex mb-4">
                <div class="w-1/2">소계</div>
                <div class="w-1/2 text-right">사달라</div>
              </div>
              <div class="flex mb-6 border-b pb-6">
                <div class="w-1/2">배송비</div>
                <div class="w-1/2 text-right">사달라</div>
              </div>
              <div class="flex pb-8 text-appleBlack-2 text-xl font-semibold">
                <div class="w-1/2">총계</div>
                <div class="w-1/2 text-right">다합쳐서 사달라</div>
              </div>
              <div class="w-full main__total--btn text-right">
                <button class="bg-blue-500 hover:bg-blue-400 text-white font-bold py-4 px-40 rounded">
                  결제
                </button>
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
export default class CartView extends Vue {

}
</script>

<style scoped>
#cartView {
  min-width: 768px;
  color: rgb(17, 17, 17);
}
.text-appleBlack-2 {
  color: rgb(17, 17, 17);
}
.main__grid {
  margin: 0 auto;
  min-width: 768px;
  max-width: 1024px;
  width: 100%
}
.main__title {
  min-width: 100%;
  height: 178px;
}
.main_title--grid {
  min-width: 100%;
  margin-bottom: 8px;
}
.main__cart {
  min-width: 100%;
}
.main__products--com {
  padding-bottom: 60px;
  margin-bottom: 62px;
}
.main__products--img {
  object-fit: cover;
  max-height: 203px;
  min-width: 203px;
  content:url("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MWU22?wid=800&hei=800&fmt=jpeg&qlt=80&op_usm=0.5,1.5&fit=constrain&.v=1566949271552");
}
.main__total {
  padding-bottom: 60px;
  margin-top: -20px;
  margin-bottom: 62px;
}
</style>
