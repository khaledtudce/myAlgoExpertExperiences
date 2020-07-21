package leetcodeContest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class MakingFileNamesUniqueTest {

	@Test
	public void test() {
		MakingFileNamesUnique obj = new MakingFileNamesUnique();
		assertThat(obj.getFolderNames(new String [] {"pes","fifa","gta","pes(2019)"}))
		.isEqualTo(new String [] {"pes","fifa","gta","pes(2019)"});	
	}
	
	@Test
	public void test1() {
		MakingFileNamesUnique obj = new MakingFileNamesUnique();
		assertThat(obj.getFolderNames(new String [] {"gta","gta(1)","gta","avalon"}))
		.isEqualTo(new String [] {"gta","gta(1)","gta(2)","avalon"});	
	}
	
	@Test
	public void test3() {
		MakingFileNamesUnique obj = new MakingFileNamesUnique();
		assertThat(obj.getFolderNames(new String [] {"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"}))
		.isEqualTo(new String [] {"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"});	
	}
	
	@Test
	public void test4() {
		MakingFileNamesUnique obj = new MakingFileNamesUnique();
		assertThat(obj.getFolderNames(new String [] {"wano","wano","wano","wano"}))
		.isEqualTo(new String [] {"wano","wano(1)","wano(2)","wano(3)"});	
	}

	@Test
	public void test5() {
		MakingFileNamesUnique obj = new MakingFileNamesUnique();
		assertThat(obj.getFolderNames(new String [] {"kaido","kaido(1)","kaido","kaido(1)"}))
		.isEqualTo(new String [] {"kaido","kaido(1)","kaido(2)","kaido(1)(1)"});	
	}
}
