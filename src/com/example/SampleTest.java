//�e�X�g�N���X
package com.example;

//Jupiter��Vintage�ɕς�����Junit4�ł悩�����H
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest {

	@Nested
	class getColor {
		// �e�X�g���\�b�g
		@Test
		void success() {
			assertEquals("��", Sample.getColor(1));
			assertEquals("��", Sample.getColor(2));
			assertEquals("��", Sample.getColor(3));
		}
		@Test
		void exceptionTesting() {
			List<Object> Sample.getColor= new ArrayList<>();
			assertThrows(IllegalArgumentException.class, () -> Sample.getColor(1));
		}
		@Test
        @DisplayName("�����G���[")
        void fail() {
            try {
                Sample.getColor(99);
                fail();
            } catch (IllegalArgumentException e) {
            }
        }
        }
		}
		

		
	

