export default class Article {
    constructor(
        public postId: number = 0,
        public author: string = '',
        public title: string ='',
        public content: string = '',
        public contensDate: Date = new Date(),
        public poststatus: string = ''
    ){}
}