package com.orichalcos;

import com.orichalcos.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

public class ElasticSearchOptionsTests extends ElasticSearchApplicationTests {

    private final ElasticsearchOperations elasticsearchOperations;

    @Autowired
    public ElasticSearchOptionsTests(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    /**
     * 索引一条文档
     */
    @Test
    public void testIndex() {
        Product product = new Product();
        product.setId(1);
        product.setTitle("小浣熊干脆面");
        product.setPrice(1.5);
        product.setDescription("小浣熊干脆面真好吃，曾经非常喜欢吃！");
        elasticsearchOperations.save(product);
    }
}
