<template>
  <div id="infoView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="main">
      <div class="main__grid">

        <section class="flex main__title content-center rounded shadow-md">
          <div class="main_title--grid flex content-center flex-wrap">
            <div class="w-full p-2">
              <div class="text-center text-3xl">
                계정 설정
              </div>
            </div>
            <div class="w-full p-2">
              <div class="text-gray-700 text-center">
                계정정보를 쉽게 업데이트 하고 옵션을 활성화 하여
                niShopping을 더욱 편하게 즐길 수 있습니다.
              </div>
            </div>
          </div>
        </section>

        <section class="main__contents border rounded-lg flex shadow-md">
          <div class="w-1/4">
            <div class="main_contents--title font-semibold">계정 정보</div>
          </div>
          <div class="w-3/4">
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              ID
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              ID_contents
            </div>
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              PW
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              PW_contents
            </div>
          </div>
        </section>

      </div>
    </div>
    <div class="footer">
      <footer/>
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
export default class InfoView extends Vue {

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
  margin: 8px 0 8px 0;
  padding: 10px 10px 0 10px;
}
.main_contents--title {
  margin: 10px;
}
.main__contents--box-t {
  margin: 0 5px 0 5px;
  padding: 10px;
  color: rgb(51, 51, 51);
}
.main__contents--box-b {
  margin: 0 5px 10px 5px;
  padding: 10px;
}

</style>
