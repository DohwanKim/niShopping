<template>
  <div class="w-1/3 my-8">
    <div class="text-center py-2 text-xs text-orange-600">
      상품 특이 사항
    </div>
    <div class="text-center mx-4">
      <div class="">
        상품 이름
      </div>
    </div>
    <div class="text-center py-2 px-4 mx-4">
      <div class="border-b">
        상품 가격
      </div>
    </div>
    <div class="main__like--img flex content-center flex-wrap">
      <div class="">
        <img class="main__products--img">
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
export default class LikeCard extends Vue {

}
</script>

<style scoped>
.main__like--img {
  min-height: 300px;
}
.main__products--img {
  object-fit: cover;
  content:url("https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MWU22?wid=800&hei=800&fmt=jpeg&qlt=80&op_usm=0.5,1.5&fit=constrain&.v=1566949271552");
}
</style>
