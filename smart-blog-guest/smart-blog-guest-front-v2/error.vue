<template>
  <div>
    <ul>
      <li>{{ error.statusCode }}</li>
      <li>{{ error.message }}</li>
      <div>
        <p>{{ statusCodeData }}</p>
        <p>{{ messageData }}</p>
      </div>
      <!-- <button @click="increment()">{{ count }}</button> -->
    </ul>
  </div>
</template>

<script setup lang="ts">
import { useError } from "nuxt/app";
import { ref } from "vue";

// const count = ref(0);

// const increment = () => {
//   count.value++;
// };

const error = useError();

const statusCodeData = error.value.statusCode;

const currentCode;

const errorResponses = {
  401: {
    statusCode: "401 Unauthorized",
    message: "認証に失敗しました",
  },
  404: {
    statusCode: "404 Not Found",
    message: "お探しのページが見つかりません",
  },
  403: {
    statusCode: "403 Forbidden",
    message: "閲覧権限が有りません",
  },
  408: {
    statusCode: "408 Request Timeout",
    message: "リクエストタイムアウトになりました",
  },
  500: {
    statusCode: "500 Internal Server Error",
    message: "サーバに予期しないエラーが発生しました",
  },

  // 原因不明のエラー
  unknownError: {
    statusCode: "Unkown Error",
    message: "原因不明のエラーが発生しました",
  },
};
</script>
