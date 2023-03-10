<template>
  <v-sheet
  >
  <v-row
   no-gutters
   class="pa-2 pr-5"
   align="center" 
  >
  {{ article.title }}
  </v-row>

</template>
<script lang="ts">
import { Component, Vue, Prop} from 'nuxt-property-decorator';
import { component } from 'vue/types/umd';
import Article from '~/domains/article/Article';

@Component
export default class ArticleSheet extends Vue {

  @Prop()
  article!: Article;

}
</script>

