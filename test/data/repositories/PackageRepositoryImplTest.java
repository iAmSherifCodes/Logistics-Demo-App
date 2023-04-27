package data.repositories;

import data.model.Package;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
    private PackageRepository packageRepository;

    @BeforeEach
    public void setUp(){
        packageRepository = new PackageRepositoryImpl();
    }

    @Test
    @DisplayName("Create new Package test")
    void saveOnePackage_countIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0,packageRepository.count());
        packageRepository.save(aPackage);
        assertEquals(1,packageRepository.count());
    }

    @DisplayName("Generate Id test")
    @Test
    void saveOnePackage_IdIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0,aPackage.getId());
        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1,aPackage.getId());
    }

    @DisplayName("Find by Id Test")
    @Test
    void saveOnePackage_findPackageById_returnsSavedPackage(){
        Package aPackage = new Package();
        aPackage.setPayOnDelivery(true);
        packageRepository.save(aPackage);
        Package foundPackage = packageRepository.findById(1);
        assertEquals(1,foundPackage.getId());
        assertTrue(foundPackage.isPayOnDelivery());
        assertEquals(aPackage, foundPackage);
    }

    @Test
    @DisplayName("Update test")
    void saveTwoItemsWithSameId_countIsOneTest(){
        Package aPackage = new Package();
        aPackage.setWeightInGram(34);
        packageRepository.save(aPackage);
        Package savedAPackage = packageRepository.findById(1);
        assertEquals(aPackage, savedAPackage);

        Package secondPackage = new Package();
        secondPackage.setId(1);
        secondPackage.setWeightInGram(22);
        packageRepository.save(secondPackage);

        Package foundPackage = packageRepository.findById(1);

        assertEquals(foundPackage, secondPackage);
        assertNotEquals(foundPackage, aPackage);
    }

    @Test
    void delete(){
        Package firstPackage = new Package();
        packageRepository.save(firstPackage);
        Package secondPackage = new Package();
        packageRepository.save(secondPackage);
        Package thirdPackage = new Package();
        packageRepository.save(thirdPackage);

        packageRepository.delete(secondPackage);

        Package fourthPackage = new Package();
        packageRepository.save(fourthPackage);

        assertEquals(3,packageRepository.count());
    }


}