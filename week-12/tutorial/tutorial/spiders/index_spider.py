import scrapy


class QuotesSpider(scrapy.Spider):
    name = "quotes"

    def start_requests(self):
        urls = [
                'https://index.hu/belfold/2018/10/31/elte_ttk_btk_sztrajk_megszoritas_kancellar_kepzesi_normativa_finanszirozas/',
            ]
        for url in urls:
            yield scrapy.Request(url=url, callback=self.parse)

    def parse(self, response):
        filename = 'index.html'
        with open(filename, 'wb') as f:
            f.write(response.body)
        self.log('Saved file %s' % filename)