<template>
  <div class="main__row">
    <div class="main__col">
      <div class="w-full relative overflow-visible">
        <div class="relative">
          <input v-model="input" type="text" class="main__txt_box" required>
          <span class="main__txt_box_label">번역가</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Vue,
  Component,
} from 'vue-property-decorator';

@Component
export default class EditForm extends Vue {
  input: string = '';
}
</script>

<style lang="scss" scoped>
  input::-webkit-outer-spin-button,
  input::-webkit-inner-spin-button {
    -webkit-appearance: none;
    margin: 0;
  }

  input[type=number] {
    -moz-appearance:textfield;
  }

  @mixin focus_input_box {
    border-color: #0070c9;
    outline: none;
    box-shadow: 0 0 0 .25rem rgba(131,192,253,.5);
  }

  @mixin txt_box {
    letter-spacing: 0;
    font-size: 1.125rem;
    line-height: 1.23543;
    font-weight: 400;
    display: inline-block;
    vertical-align: top;
    width: 100%;
    height: 3.3em;
    margin: 0 0 .875rem 0;
    padding: 1.125rem 1rem 0 1rem;
    color: #333333;
    text-align: left;
    border: 1px solid #d6d6d6;
    border-radius: 4px;
    background: hsla(0,0%,100%,.8);
    background-clip: padding-box;
  }

  @mixin txt_box_label {
    position: absolute;
    top: 1.125rem;
    left: 1.125rem;
    color: #888;
    padding: 0;
    letter-spacing: 0;
    font-size: 1.125rem;
    line-height: 1.23543;
    font-weight: 400;
    display: block;
    vertical-align: top;
    pointer-events: none;
  }

  @mixin txt_box_label_focus {
    font-size: .75rem;
    line-height: 1.75;
    top: .5rem;
    color: #666666;
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
        background: hsla(0,0%,100%,.8);
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

      .main__txt_box {
        @include txt_box;
        &:focus {
          @include focus_input_box;
        }
      }

      .main__txt_box_label {
        @include txt_box_label;
      }

      .main__txt_box:focus ~ .main__txt_box_label,
      .main__txt_box:not(focus):valid ~ .main__txt_box_label {
        @include txt_box_label_focus;
      }
    }
  }
</style>
