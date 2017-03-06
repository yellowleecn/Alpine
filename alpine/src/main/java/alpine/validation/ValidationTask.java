/*
 * This file is part of Alpine.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package alpine.validation;

import java.util.regex.Pattern;

public class ValidationTask {

    private Pattern pattern;
    private String input;
    private String errorMessage;

    public ValidationTask(Pattern pattern, String input, String errorMessage) {
        this.pattern = pattern;
        this.input = input;
        this.errorMessage = errorMessage;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public String getInput() {
        return input;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}