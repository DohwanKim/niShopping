<template>
  <div class="main__row">
    <div class="main__col">
      <div class="w-full relative overflow-visible">
        <div class="relative">
          <input v-if="name==='stock' || name==='pages'" @input="$emit(`${name}`, input)" v-model="input" type="number" class="main__txt_box" min="0" step="1" required>
          <input v-else @input="$emit(`${name}`, input)" v-model="input" type="text" class="main__txt_box" required>
          <span class="main__txt_box_label">{{name}}</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import {
  Vue,
  Component,
  Prop,
} from 'vue-property-decorator';

@Component
export default class EditForm extends Vue {
  @Prop(String) readonly name: string | undefined;

  input: string = '';
}
</script>

<style lang="scss" scoped>
  @import '../assets/css/edit.scss';

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
