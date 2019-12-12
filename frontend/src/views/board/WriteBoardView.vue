<template>
  <div id="writeboard">
    <div class="nav">
      <NavBar />
    </div>
    <div class="content_wrap">
      <nav class="header">
        <div class="header__title_wrap">
          <a class="header__title_txt">커뮤니티</a>
          <a class="header__notice_link">공지사항</a>
        </div>
        <div class="header__nav_wrap">
          <div class="header__profile">
            <a class="header__profile text-appleBlue" role="button">
              <img class="header__profile--avatar" src="../../assets/img/SYSTEM_DEFAULT_AVATAR.png" alt="user avatar" aria-hidden="true">
              <span class="header__profile--txt header__profile--user">userName</span>
            </a>
            <a class="header__profile--txt header__logout">로그아웃</a>
          </div>
          <div class="-mt-4px">
            <a class="header__subnav">나의 알림</a>
            <a class="header__subnav">둘러보기</a>
            <a class="header__subnav">검색</a>
            <a class="header__subnav">글쓰기</a>
          </div>
        </div>
      </nav>
      <main class="main">

      </main>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Vue,
  Component,
} from 'vue-property-decorator';
import NavBar from '../../components/NavBar.vue';

@Component({
  components: {
    NavBar,
  },
})
export default class WriteBoardView extends Vue {
}
</script>

<style lang="scss" scoped>
  .content_wrap {
    max-width: 1024px;
    margin: 0 auto 20px auto;
    color: #333333;
    font-size: 18px;
    direction: ltr;
    text-align: left;

    .header {
      position: relative;
      display: block;
      padding: 0 22px;

      .header__title_wrap {
        align-items: center;
        border-bottom: 1px solid #d6d6d6;
        padding-bottom: 9px;
        padding-top: 10px;
        display: flex;
        flex-direction: row;
        justify-content: space-between;

        .header__title_txt {
          font-size: 28px;
          font-weight: 200;
          margin: 0;
        }

        .header__notice_link {
          align-self: flex-end;
          margin-bottom: 1px;
          position: relative;
          display: inline-block;
          font-size: 14px;
          font-weight: 400;
          margin-left: 21px;
        }
      }

      .header__nav_wrap {
        margin-top: 17px;
        align-items: flex-start;
        display: flex;
        flex-direction: row;
        justify-content: space-between;

        .header__profile {
          display: flex;
          flex-direction: row;
          margin-left: 0;
          align-items: center;

          .header__profile--avatar {
            width: 36px;
            height: 36px;
            object-fit: contain;
            border: 1px solid #c5c5c5;
            border-radius: 50px;
            margin-right: 16px;
          }

          .header__profile--user {
            max-width: 125px;
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
            margin-left: 0;
          }

          .header__logout {
            margin-left: 13px;
            padding-left: 14px;
            border-left: 1px solid #d6d6d6;
            height: 20px;
          }

          .header__profile--txt {
            color: #0070c9;
            position: relative;
            display: inline-block;
            font-size: 14px;
            font-weight: 400;
            cursor: pointer;
          }
        }

        .header__subnav {
          position: relative;
          display: inline-block;
          font-size: 14px;
          font-weight: 400;
          color: #333;
          margin-left: 21px;
        }
      }
    }

    .main {
      position: relative;
      width: 100%;
      padding: 0 16px;
      display: block;
    }
  }
</style>
