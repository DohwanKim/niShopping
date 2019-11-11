<template>
  <div id="myInfoView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <div class="main__grid">
        <section class="flex main__title content-center rounded shadow-md">
          <div class="main_title--grid flex content-center flex-wrap">
            <div class="w-full p-2">
              <div class="text-center text-3xl">
                회원 메뉴
              </div>
            </div>
            <div class="w-full p-2">
              <div class="text-gray-700 text-center">
                당신의 정보를 쉽게 확인하고 하고 당신의 여러 정보를 확인하며
                niShopping을 더욱 편하게 즐길 수 있습니다.
              </div>
            </div>
          </div>
        </section>
        <section class="flex flex-wrap main__contents rounded-lg contents-center text-center">
          <div class="w-1/2 main__contents--box">
            <div class="font-semibold text-xl">
              계정 정보
            </div>
            <div class="main__contents--msg">
              설명란 하이하이
            </div>
          </div>
          <div class="w-1/2 main__contents--box">
            <div class="font-semibold text-xl">
              주문 정보
            </div>
            <div class="main__contents--msg">
              설명란 하이하이
            </div>
          </div>
          <div class="w-1/2 main__contents--box">
            <div class="font-semibold text-xl">
              장바구니 정보
            </div>
            <div class="main__contents--msg">
              설명란 하이하이
            </div>
          </div>
          <div class="w-1/2 main__contents--box">
            <div class="font-semibold text-xl">
              찜 정보
              </div>
            <div class="main__contents--msg">
              설명란 하이하이
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
import NavBar from '../components/NavBar.vue';

@Component({
  components: {
    NavBar,
  },
})
export default class MyInfoView extends Vue {

}
</script>

<style scoped>
#infoView {
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
  height: 178px;
}
.main_title--grid {
  min-width: 100%;
  padding: 10px 10px 0 10px;
  margin-bottom: 8px;
}
.main__contents {
  color: rgb(51, 51, 51);
  margin: 8px 0 8px 0;
  padding: 50px 10px 0 10px;
}
.main__contents--box {
  min-height: 150px;
  padding: 10px;
  color: rgb(51, 51, 51);
}

</style>
