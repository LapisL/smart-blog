<template>
  <v-card
    class="mx-auto my-12"
    max-width="374"
  >
    <template slot="progress">
      <v-progress-linear
        color="deep-purple"
        height="10"
        indeterminate
      ></v-progress-linear>
    </template>
    <div v-for="(article, id) in articles"
    :key="artilce.postId"
    >
    <v-card-title>Cafe Badilico</v-card-title>

    <v-card-text>
      <v-row
        align="center"
        class="mx-0"
      >
      </v-row>
    </v-card-text>

    <v-divider class="mx-4"></v-divider>

    <v-card-title>Tonight's availability</v-card-title>

    <v-card-text>

    </v-card-text>
  </v-card>
</template>

<script lang="ts">
import { Component, Vue } from 'nuxt-property-decorator';
import axios from 'axios';
import Article from '~/domains/article/Article';

@Component
export default class IndexPage extends Vue{

  articles: Article[] = [];

  async fetch(){
    const response  = await axios.get("http://localhost:8383/article/list")
    this.articles = response.data;
    console.log(this.articles);

  }
}
</script>
