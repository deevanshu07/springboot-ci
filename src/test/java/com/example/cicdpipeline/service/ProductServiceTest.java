package com.example.cicdpipeline.service;

import com.example.cicdpipeline.entity.Product;
import com.example.cicdpipeline.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Mock
    private ProductRepository repo;

    @InjectMocks
    private ProductService service;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    // ✅ Covers save()
    @Test
    void testSaveProduct() {
        Product input = new Product(null, "Laptop", 50000);

        Product saved = new Product(1L, "Laptop", 50000);

        when(repo.save(input)).thenReturn(saved);

        Product result = service.save(input);

        assertNotNull(result);
        assertEquals("Laptop", result.getName());
        assertEquals(50000, result.getPrice());

        verify(repo, times(1)).save(input);
    }

    // ✅ Covers getAll()
    @Test
    void testGetAllProducts() {
        List<Product> products = Arrays.asList(
                new Product(1L, "Phone", 20000),
                new Product(2L, "Tablet", 30000)
        );

        when(repo.findAll()).thenReturn(products);

        List<Product> result = service.getAll();

        assertEquals(2, result.size());
        assertEquals("Phone", result.get(0).getName());

        verify(repo, times(1)).findAll();
    }
}
