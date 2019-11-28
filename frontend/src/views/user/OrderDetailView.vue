<template>
  <div id="orderDetailView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <div class="main__grid text-appleblack-2">
        <section class="flex main__title content-center rounded">
          <div class="main__title--grid content-center">
            <div class="flex flex-wrap content-end main__title--banner w-full">
              <div class="w-full">
                <div class="text-4xl font-extrabold">주문 세부 정보</div>
              </div>
            </div>
          </div>
        </section>
        <section class="main__detail">
          <div class="main__detail--height border-b">
            <div class="flex">
              <div class="w-2/5">
                <div class="flex justify-center main__detail--img-grid">
                  <img class="main__detail--img self-center">
                </div>
              </div>
              <div class="w-3/5 flex content-center flex-wrap">
                <div class="w-full main__detail--deliver">
                  <div class="">{배송 현황}</div>
                </div>
              </div>
            </div>
          </div>
          <div class="main__detail--height border-b">
            <div class="flex">
              <div class="w-1/4">
                <div class="text-center text-xl font-semibold">주문 정보</div>
              </div>
              <div class="w-3/4 flex content-center flex-wrap">
                <div class="w-full main__detail--deliver text-sm">
                  <div class="flex main__detail--font-m">
                    <div class="w-1/2 font-semibold">
                      {주문 제품 이름}
                    </div>
                    <div class="w-1/2 font-semibold">
                      가격: {사달라}
                    </div>
                  </div>
                  <div class="flex main__detail--font-m">
                    <div class="w-1/2">
                      주문 날짜 : {yy/mm/dd}
                    </div>
                    <div class="w-1/2">
                      주문 번호 : {a1234567890}
                    </div>
                  </div>
                  <div class="flex main__detail--font-m">
                    <div class="w-1/2">
                      택배 코드 : {1111-1111-1111}
                    </div>
                    <div class="w-1/2">
                      연락처 : {000-0000-0000}
                    </div>
                  </div>
                  <div class="flex main__detail--font-m">
                    <div class="w-1/2">
                      배송지 : {동륜 아파트}
                    </div>
                    <div class="w-1/2">
                      배송 메모 : {경비실에 맡겨주세요.}
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="main__detail--height border-b">
            <div class="flex">
              <div class="w-1/4">
                <div class="text-center text-xl font-semibold">결제 정보</div>
              </div>
              <div class="w-3/4 flex content-center flex-wrap">
                <div class="w-full main__detail--deliver">
                  <div class="flex main__detail--font-m">
                    <div class="w-1/2">
                      결제수단
                    </div>
                    <div class="w-1/2 text-right">
                      {카카오뱅크} : {1111-****-****-****}
                    </div>
                  </div>

                  <div class="flex main__detail--font-m">
                    <div class="w-1/2">프로모션 ({사용 쿠폰})</div>
                    <div class="w-1/2 text-right">-{사달라}</div>
                  </div>
                  <div class="flex main__detail--font-m">
                    <div class="w-1/2">배송비</div>
                    <div class="w-1/2 text-right">+{사달라}</div>
                  </div>
                  <div class="flex my-4 py-2 border-t text-xl font-semibold">
                    <div class="w-1/2">총계</div>
                    <div class="w-1/2 text-right">{다합쳐서 사달라}</div>
                  </div>
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
export default class OrderDetailView extends Vue {

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
.main__detail--height {
  margin-bottom: 30px;
  min-height: 300px;
}
.main__detail--img-grid {
  min-height: 300px;
  margin-right: 10px;
}
.main__detail--img {
  object-fit: cover;
  content:url("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MWU22?wid=800&hei=800&fmt=jpeg&qlt=80&op_usm=0.5,1.5&fit=constrain&.v=1566949271552");
}
.main__detail--deliver {
  height: 100px;
}
.main__detail--font-m {
  margin-bottom: 10px;
}
</style>
