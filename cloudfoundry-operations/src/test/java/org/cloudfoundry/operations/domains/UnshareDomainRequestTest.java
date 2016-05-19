/*
 * Copyright 2013-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.operations.domains;

import org.junit.Test;

public final class UnshareDomainRequestTest {

    @Test(expected = IllegalStateException.class)
    public void noDomain() {
        UnshareDomainRequest.builder()
            .organization("test-organization")
            .build();
    }

    @Test(expected = IllegalStateException.class)
    public void noOrganization() {
        UnshareDomainRequest.builder()
            .domain("test-domain")
            .build();
    }

    @Test
    public void valid() {
        UnshareDomainRequest.builder()
            .domain("test-domain")
            .organization("test-organization")
            .build();
    }

}
