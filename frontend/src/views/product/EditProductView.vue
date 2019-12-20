<template>
  <div id="editProductView">
    <div class="nav">
      <NavBar />
    </div>
    <div class="header">
      <div class="relative min-w-md">
        <div class="h-48 w-full bg-gray-400 flex items-center justify-center">
          <div class="relative mx-auto px-4">
            <h1 class="header__title">NiShopping 상품 등록</h1>
          </div>
        </div>
      </div>
    </div>
    <div class="main">
      <div class="main__section">
        <div class="m-auto max-w-480px">
          <div class="main__form_table">
            <div class="main__form_cell">
              <div class="main__form_column">
                <input v-model="enteredProductInfo.name" type="text" class="main__form_txtbox" required>
                <span class="main__form_label">이름</span>
              </div>
              <div class="main__form_column">
                <input v-model="enteredProductInfo.price" type="number" class="main__form_txtbox" min="0" step="1" required>
                <span class="main__form_label">가격</span>
              </div>
            </div>
          </div>
          <div class="main__row">
            <div class="main__col">
              <h3 class="main__sec_sub_title">
                국가/지역
              </h3>
              <div class="relative">
                <select class="main__selector">
                  <option value="TWN">대만</option>
                  <option value="KOR">대한민국</option>
                  <option value="DEU">독일</option>
                  <option value="USA">미국</option>
                  <option value="ITA">이탈리아</option>
                  <option value="JPN">일본</option>
                  <option value="CHN">중국</option>
                  <option value="FRA">프랑스</option>
                </select>
                <span class="fas fa-chevron-down main__selector_icon" aria-hidden="true"></span>
              </div>
            </div>
          </div>
          <EditForm :name="'seller'" @seller="enteredProductInfo['seller'] = $event" />
        </div>
      </div>
      <div class="main__section">
        <div class="m-auto max-w-480px">
          <EditForm :name="'stock'" @stock="enteredProductInfo['stock'] = $event" />
          <EditForm :name="'release'" @release="enteredProductInfo['release'] = $event" />
          <EditForm :name="'author'" @author="enteredProductInfo['author'] = $event" />
        </div>
      </div>
      <div class="main__section">
        <div class="m-auto max-w-480px">
          <EditForm :name="'publisher'" @publisher="enteredProductInfo['publisher'] = $event" />
          <EditForm :name="'salesRate'" @salesRate="enteredProductInfo['salesRate'] = $event" />
          <EditForm :name="'promotion'" @promotion="enteredProductInfo['promotion'] = $event" />
        </div>
      </div>
      <div class="main__section">
        <div class="m-auto max-w-480px">
          <EditForm :name="'image'" @image="enteredProductInfo['image'] = $event"/>
          <EditForm :name="'translator'" @translator="enteredProductInfo['translator'] = $event"/>
          <EditForm :name="'summary'" @summary="enteredProductInfo['summary'] = $event" />
        </div>
      </div>
      <div class="main__section">
        <div class="m-auto max-w-480px">
          <EditForm :name="'size'" @size="enteredProductInfo['size'] = $event" />
          <EditForm :name="'weight'" @weight="enteredProductInfo['weight'] = $event" />
          <EditForm :name="'pages'" @pages="enteredProductInfo['pages'] = $event" />
        </div>
      </div>
      <button @click.prevent="productRegistration" type="submit" title="제출" class="tmp_button hover:bg-blue-600">
        <span>장바구니에 담기</span>
      </button>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Vue,
  Component,
} from 'vue-property-decorator';
import NavBar from '../../components/NavBar.vue';
import EditForm from '../../components/EditForm.vue';
// import * as productService from '../../service/productService';

@Component({
  components: {
    NavBar,
    EditForm,
  },
})
export default class EditProductView extends Vue {
  private enteredProductInfo: object = {
    name: '',
    price: 0,
    seller: '',
    stock: 0,
    release: '',
    author: '',
    publisher: '',
  };

  productRegistration(): void {
    // productService.createProduct(this.enteredProductInfo);
  }

  modifyProductInfo(): void{

  }
}
</script>

<style lang="scss" scoped>
  @import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css');
  @import '../../assets/css/edit.scss';

  .header__title {
    text-align: center;
    padding: 0;
    margin: 0;
    font-size: 2.5rem;
    line-height: 1.1;
    font-weight: 600;
    letter-spacing: 0;
    display: block;
    text-shadow: 0 0 30px rgba(0,0,0,.5);
  }

  .main {
    min-height: 100%;
    background: transparent;

    .main__section {
      padding: 1rem 0 1.25rem 0;
      max-width: 1200px;
      margin: auto;
      width: 80%;
      border-bottom: 1px solid #e7e7e8;

      .main__form_table {
        display: table;
        width: 100%;
        text-align: left;
        position: relative;

        .main__form_cell {
          display: table-cell;
          vertical-align: top;
          direction: ltr;

          .main__form_column {
            position: relative;
            float: left;
            width: 50%;
            margin: 0;
            padding: 0 1rem 0 0;
            &:last-child {
              padding-right: 0;
            }

            .main__form_txtbox {
              @include txt_box;
              &:focus {
                @include focus_input_box;
              }
            }

            .main__form_label {
              @include txt_box_label;
            }

            .main__form_txtbox:focus ~ .main__form_label,
            .main__form_txtbox:not(focus):valid ~ .main__form_label {
              @include txt_box_label_focus;
            }
          }
        }
      }

      .main__row {
        margin-left: -1rem;
        margin-right: -1rem;
        margin-top: 1em;
        position: relative;
        &:before, &:after {
          content: " ";
          display: table;
        }
        &:after {
          clear: both;
        }

        .main__col {
          padding: 0 1rem;
          width: 100%;
          position: relative;
          margin: 0;
          float: left;

          .main__sec_sub_title {
            letter-spacing: 0;
            color: #666;
            font-weight: 600;
            padding: 0 0 .125rem 0;
            margin: 0;
            font-size: .875rem;
            line-height: 1.42861;
          }

          .main__selector {
            padding: 0 1.75rem 0 .94118rem;
            letter-spacing: 0;
            font-size: 1.125rem;
            line-height: 1.23543;
            font-weight: 400;
            display: block;
            width: 100%;
            height: 3.3em;
            color: #333;
            text-align: left;
            background: hsla(0, 0%, 100%, .8);
            border: 1px solid #d6d6d6;
            border-radius: 4px;
            background-clip: padding-box;
            margin-bottom: 0.875rem;
            appearance: none;
            &:focus {
              @include focus_input_box;
            }
          }

          .main__selector_icon {
            display: block;
            pointer-events: none;
            color: #888;
            right: 1.125rem;
            font-size: .875rem;
            top: 1.42rem;
            line-height: 0;
            position: absolute;
          }

          .main__selector_icon:before {
            display: inline-block;
            line-height: 1;
            position: relative;
          }
        }
      }
    }
  }

  .tmp_button {
    display: inline-block;
    background-color: #0070c9;
    color: #fff;
    text-align: center;
    font-weight: 400;
    line-height: 1.5;
    margin: 0;
    padding: 4px 16px;
    border: 1px solid #2b6cb0;
    border-radius: .25rem;
    white-space: nowrap;
    font-size: 18px;
    box-sizing: border-box;
    width: 100%;
    min-width: 30px;
    overflow: visible;
  }
</style>
