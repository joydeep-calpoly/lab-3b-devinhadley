package lab_3c;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class ServiceTest {
    Database mockDatabase;

    @BeforeEach
    public void setUp() {
        mockDatabase = Mockito.mock(Database.class);
    }

    @Test
    public void testGetDatabaseId(){
        when(mockDatabase.getUniqueId()).thenReturn(100);
        Service service = new Service(mockDatabase);
        String uniqueId = service.getDatabaseID();
        String expected = "Using database with id: 100";
        assertEquals(expected, uniqueId);
    }
}
