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
          <div class="w-1/4 main_contents--title font-semibold">
            <div class="">계정 정보</div>
            <div v-show="modified === 0">
              <button class="text-sm font-normal text-appleBlue bg-transparent border-0 p-0 hover:underline">
                <span @click="changeModified()">수정</span>
              </button>
            </div>
            <div class="" v-show="modified === 1">
              <button class="text-sm font-normal text-appleBlue bg-transparent border-0 p-0 hover:underline">
                <span @click="changeModified()">수정 완료</span>
              </button>
              <button class="text-sm font-normal text-appleBlue bg-transparent border-0 p-0 hover:underline px-2">
                <span @click="cancelModified()">수정 취소</span>
              </button>
            </div>
          </div>
          <div class="w-3/4">
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              이메일(아이디)
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              {{ userInfo.userEmail }}
            </div>
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              이름
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              {{ userInfo.userName }}
            </div>
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              닉네임
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              {{ userInfo.userNick }}
            </div>
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              주소
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              <div v-show="modified === 0">
                {{ userInfo.userAddress }}
              </div>
              <div v-show="modified === 1">
                <label>
                  <input class="placeholder-gray-500 border main__contents--input" v-model="changeInfo.inputAddress" placeholder="새로운 정보를 입력해 주세요">
                </label>
              </div>
            </div>
            <div class="main__contents--box-t bg-gray-300 rounded-t-lg">
              전화번호
            </div>
            <div class="main__contents--box-b rounded-b-lg shadow-md">
              <div v-show="modified === 0">
                {{ userInfo.userPhoneNumber }}
              </div>
              <div v-show="modified === 1">
                <label>
                  <input class="placeholder-gray-500 border main__contents--input" v-model="changeInfo.inputPhoneNumber" placeholder="새로운 정보를 입력해 주세요">
                </label>
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
import AuthService from '../../service/AuthService';

@Component({
  components: {
    NavBar,
    Footer,
  },
})
export default class InfoView extends Vue {
  modified = 0;

  userInfo = {
    userEmail: '',
    userName: '',
    userNick: '',
    userImage: '',
    userAddress: '',
    userPhoneNumber: '',
  };

  changeInfo = {
    inputAddress: '',
    inputPhoneNumber: '',
  };

  created() {
    new AuthService().getUser().then((res) => {
      if (res) {
        this.userInfo.userEmail = res.profile.email;
        this.userInfo.userName = res.profile.name;
        this.userInfo.userNick = res.profile.nickname;
        this.userInfo.userImage = res.profile.picture;
        this.userInfo.userAddress = res.profile.address;
        this.userInfo.userPhoneNumber = res.profile.phoneNumber;
      }
    });
  }

  changeModified() :void{
    if (this.modified === 0) {
      this.modified = 1;
    } else {
      if (this.changeInfo.inputAddress === '') {
        alert("주소가 입력되지 않았습니다.");
      } else {
        this.userInfo.userAddress = this.changeInfo.inputAddress;
        this.userInfo.userPhoneNumber = this.changeInfo.inputPhoneNumber;
        this.clearModifiedData();
        this.modified = 0;
      }
    }
  }

  cancelModified() :void{
    this.clearModifiedData();
    this.modified = 0;
  }

  clearModifiedData() :void{
    this.changeInfo.inputAddress = '';
    this.changeInfo.inputPhoneNumber = '';
  }
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
.main__contents--input {
  width: 100%;
}
.hidden {
  visibility: hidden;
  opacity: 0;
  transition: visibility 0s 2s, opacity 2s linear;
}
</style>
