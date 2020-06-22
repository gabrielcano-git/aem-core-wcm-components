/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public interface ClientLibraries {

    /**
     * Returns the clientlib categories of:
     * - the requested resource and its descendants
     * - the resource types and super resource types
     * - the resource types used by the referenced experience fragments
     * - the template content resource below template/structure and all its descendants, if the resource is a page or page content
     * - the page policy and page design, if the resource is a page or page content
     *
     * Note: following HTL options can be injected into the ClientLibraries model:
     * - categories: replaces the categories computed for the resource and its descendants
     * - additionnalCategories: adds those categories to the ones computed for the resource and its descendants
     * - categoryFilter: regular expression to filter the categories based on their names
     * - async: injected into the JS script tags
     * - defer: injected into the JS script tags
     * - crossorigin: injected into the JS script tags
     * - onload: injected into the JS script tags
     * - media: injected into the CSS link tags
     *
     * @return the clientlib categories
     */
    default String[] getCategories() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a concatenation of all the JS libraries defined for the requested resource.
     *
     * @return the inlined JS libraries
     */
    default String getJsInline() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a concatenation of all the CSS libraries defined for the requested resource.
     *
     * @return the inlined CSS libraries
     */
    default String getCssInline() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a concatenation of all the HTML JS script tags defined for the requested resource.
     *
     * @return the HTML JS script tags
     */
    default String getJsTags() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a concatenation of all the HTML CSS link tags defined for the requested resource.
     *
     * @return the HTML CSS link tags
     */
    default String getCssTags() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a concatenation of all the HTML JS script and CSS link tags defined for the requested resource.
     *
     * @return the HTML JS script and CSS link tags
     */
    default String getJsAndCssTags() {
        throw new UnsupportedOperationException();
    }

}
