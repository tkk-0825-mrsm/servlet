//テストクラス
package com.example;

//JupiterをVintageに変えたらJunit4でよかった？
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest {

	@Nested
	class getColor {
		// テストメソット
		@Test
		void success() {
			assertEquals("赤", Sample.getColor(1));
			assertEquals("緑", Sample.getColor(2));
			assertEquals("青", Sample.getColor(3));
		}
		@Test
		void fail() {
			List<Object> it = new ArrayList<>();
			assertThrows(IndexOutOfBoundsException.class, () -> it.get(1));
		}
		}

		@Test
		@DisplayName("引数エラー")
		void fail() {
		
			try {
				Sample.getColor(99);
				fail();
			} catch (IllegalArgumentException e) {
			}
		}
	}

