<template>
  <div id="finalOrderView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <div class="main__grid">
        <section class="flex main__title content-center">
          <div class="main_title--grid flex content-center flex-wrap">
            <div class="w-full py-2">
              <div class="text-3xl font-bold">
                주문 결제
              </div>
            </div>
            <div class="w-full">
              <div class="text-gray-700">
                주문 품목을 확인하시고 배송지와 결제 방식을 선택 하여 주세요.
              </div>
            </div>
          </div>
        </section>
      </div>
      <div class="main__grid">
        <section class="main__orderInfo">

          <div class="main__products--grid">
            <div class="flex text-xl">
              <div class="w-1/6 self-center">
                <img class="main__products--img">
              </div>
              <div class="w-2/6 self-center">
                {물건이름}
              </div>
              <div class="w-1/6 self-center">
                수량:{1}
              </div>
              <div class="w-2/6 self-center text-right">
                {10000}원
              </div>
            </div>
          </div>

          <div class="main__products--grid">
            <div class="flex text-xl">
              <div class="w-1/6 self-center">
                <img class="main__products--img">
              </div>
              <div class="w-2/6 self-center">
                {물건이름}
              </div>
              <div class="w-1/6 self-center">
                수량:{1}
              </div>
              <div class="w-2/6 self-center text-right">
                {10000}원
              </div>
            </div>
          </div>

          <div class="main__shipment border-b border-t">
            <div class="flex">
              <div class="w-1/4">
                <div class="text-center text-xl font-semibold">배송 정보</div>
              </div>
              <div class="w-3/4 flex content-center flex-wrap">
                <div class="w-full main__detail--deliver">
                  <div class="flex">
                    <div>
                      {이름}
                    </div>
                  </div>
                  <div class="flex my-2">
                    <div>
                      {010-0000-0000}
                    </div>
                  </div>
                  <div class="flex main__shipment--address border-t">
                    <div class="w-5/6 font-semibold">
                      배송지
                    </div>
                    <div class="w-1/6 text-right">
                      <button @click="changeAddress" class="text-sm font-normal text-appleBlue bg-transparent border-0 p-0 hover:underline">
                        <span>배송 정보 수정</span>
                      </button>
                    </div>
                  </div>
                  <div v-if="addressModifiedCheck" class="flex flex-wrap">
                    <div class="w-full">
                      {우편 번호}
                    </div>
                    <div class="w-full">
                      {주소}
                    </div>
                    <div class="w-full">
                      {세부 주소}
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="border-b">
            <div class="main__payment flex">
              <div class="w-1/4">
                <div class="text-center text-lg font-semibold">
                  지불 방식 선택
                </div>
                <div class="flex flex-wrap text-center">
                  <div class="w-full my-2">
                    <input type="radio" id="card" value="Card" v-model="paymentSelect">
                    <label for="card"> 카드 결제</label>
                  </div>
                  <div class="w-full">
                    <input type="radio" id="account" value="Account" v-model="paymentSelect">
                    <label for="account"> 계좌 이체</label>
                  </div>
                  <div class="w-full my-2">
                    <input type="radio" id="pay" value="Pay" v-model="paymentSelect">
                    <label for="pay"> 페이 결제</label>
                  </div>
                </div>
              </div>
              <div class="w-3/4 flex content-center flex-wrap">
                <div class="w-full" v-if="paymentSelect === 'Card'">
                  <div class="flex">
                    카드 결제 내용
                  </div>
                </div>
                <div class="w-full" v-if="paymentSelect === 'Account'">
                  <div class="flex">
                    계좌 이체 내용
                  </div>
                </div>
                <div class="w-full" v-if="paymentSelect === 'Pay'">
                  <div class="flex">
                    페이 결제 내용
                  </div>
                </div>
                <div class="w-full" v-if="paymentSelect === ''">
                  <div class="flex">
                    결제를 선택하세요.
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
        <section class="main__total border-b">
          <div class="main__total--info flex">
            <div class="w-1/4"></div>
            <div class="w-3/4 text-appleBlack">
              <div class="flex my-2">
                <div class="w-1/2">프로모션 ({사용 쿠폰})</div>
                <div class="w-1/2 text-right">-{사달라}</div>
              </div>
              <div class="flex my-2">
                <div class="w-1/2">배송비</div>
                <div class="w-1/2 text-right">+{사달라}</div>
              </div>
              <div class="flex my-2 border-b pb-6">
                <div class="w-1/2">소계</div>
                <div class="w-1/2 text-right">사달라</div>
              </div>
              <div class="flex my-2 text-appleBlack-2 text-xl font-semibold">
                <div class="w-1/2">총계</div>
                <div class="w-1/2 text-right">다합쳐서 사달라</div>
              </div>
              <div class="w-full main__total--btn text-right">
                <button class="bg-blue-500 hover:bg-blue-400 text-white font-bold py-4 px-40 rounded">
                  주문하기
                </button>
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
import index from '@/store';

@Component({
  components: {
    NavBar,
    Footer,
  },
})
export default class FinalOrderView extends Vue {
  addressModified: boolean = false;

  paymentSelect: String = '';

  orderProducts: [
    {
      name: '',
    },
  ];

  orderAddress = {
    name: '',
    PhoneNumber: '',
    postNumber: '',
    FirstAddress: '',
    LastAddress: '',
  };

  get selectPayment() {
    if (this.paymentSelect === 'Card') {

    } else if (this.paymentSelect === 'Account') {

    } else if (this.paymentSelect === 'Pay') {

    } else {
      return false;
    }
  }

  get addressModifiedCheck() {
    return !this.addressModified;
  }

  changeAddress() {
    this.addressModified = !this.addressModified;
  }
}
</script>

<style scoped>
  #finalOrderView {
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
  .main__shipment {
    padding: 20px 0 40px 0;
    height: 220px;
    margin-bottom: 20px;
  }
  .main__shipment--address {
    padding-top: 10px;
  }
  .main__detail--deliver {
    height: 100px;
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
  .main__products--grid{
    margin-bottom: 10px;
  }
  .main__products--img {
    object-fit: cover;
    max-height: 80px;
    min-width: 80px;
    content:url("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MWU22?wid=800&hei=800&fmt=jpeg&qlt=80&op_usm=0.5,1.5&fit=constrain&.v=1566949271552");
  }
  .main__payment{
    margin-bottom: 20px;
  }
  .main__total {
    padding-bottom: 60px;
    margin-bottom: 62px;
  }
</style>
