package com.example.setlistaggregatorjava.setlistaggregator;

import com.example.setlistaggregatorjava.model.Setlist;
import com.example.setlistaggregatorjava.repository.SetlistRepository;
import com.example.setlistaggregatorjava.service.SetlistService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class SetlistServiceTest {

    @Test
    void testGetAllSetlists() {
        // Arrange: Mock the repository
        SetlistRepository setlistRepository = Mockito.mock(SetlistRepository.class);
        SetlistService setlistService = new SetlistService(setlistRepository);

        Setlist setlist1 = new Setlist();
        setlist1.setArtist("Artist A");

        Setlist setlist2 = new Setlist();
        setlist2.setArtist("Artist B");

        // Mock the behavior of findAll() method in the repository
        when(setlistRepository.findAll()).thenReturn(List.of(setlist1, setlist2));

        // Act: Call the method to be tested
        List<Setlist> setlists = setlistService.getAllSetlists();

        // Assert: Verify that the results are as expected
        assertEquals(2, setlists.size());
        assertEquals("Artist A", setlists.get(0).getArtist());
        assertEquals("Artist B", setlists.get(1).getArtist());
    }
}
