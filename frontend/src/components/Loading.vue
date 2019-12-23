<template>
  <div class="tmp">
    <div class="v-spinner" v-show="this.loading">
      <div class="v-clip" v-bind:style="spinnerStyle">
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
export default class Loading extends Vue {
  @Prop({ default: true }) readonly loading!: boolean;

  @Prop({ default: '#888888' }) readonly color!: string;

  @Prop({ default: '35px' }) readonly size!: string;

  @Prop({ default: '100%' }) readonly radius!: string;

  get spinnerStyle() {
    return {
      height: this.size,
      width: this.size,
      borderWidth: '11px',
      borderStyle: 'solid',
      borderColor: `${this.color} ${this.color} transparent`,
      borderRadius: this.radius,
      background: 'transparent',
    };
  }
}
</script>

<style lang="scss" scoped>
  .tmp {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vw;
  }

  .v-spinner {
    text-align: center;
    max-width: 50%;
  }

  .v-spinner .v-clip {
    -webkit-animation: v-clipDelay 0.75s 0s infinite linear;
    animation: v-clipDelay 0.75s 0s infinite linear;
    -webkit-animation-fill-mode: both;
    animation-fill-mode: both;
    display: inline-block;
  }

  @media (max-height: 500px) {
    .v-spinner {
      padding-top: 17rem
    }
  }

  @-webkit-keyframes v-clipDelay
  {
    0% {
      -webkit-transform: rotate(0deg) scale(1);
      transform: rotate(0deg) scale(1);
    }
    50% {
      -webkit-transform: rotate(180deg) scale(0.8);
      transform: rotate(180deg) scale(0.8);
    }
    100% {
      -webkit-transform: rotate(360deg) scale(1);
      transform: rotate(360deg) scale(1);
    }
  }
  @keyframes v-clipDelay
  {
    0% {
      -webkit-transform: rotate(0deg) scale(1);
      transform: rotate(0deg) scale(1);
    }
    50% {
      -webkit-transform: rotate(180deg) scale(0.8);
      transform: rotate(180deg) scale(0.8);
    }
    100% {
      -webkit-transform: rotate(360deg) scale(1);
      transform: rotate(360deg) scale(1);
    }
  }
</style>
