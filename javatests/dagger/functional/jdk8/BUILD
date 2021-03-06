# Copyright (C) 2017 The Dagger Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Description:
#   Functional tests for Dagger that depend on Guava

package(default_visibility = ["//:src"])

load("//:build_defs.bzl", "DOCLINT_HTML_AND_SYNTAX")
load("//:test_defs.bzl", "GenJavaTests")

GenJavaTests(
    name = "jdk8_tests",
    srcs = glob(["**/*.java"]),
    javacopts = DOCLINT_HTML_AND_SYNTAX,
    test_only_deps = [
        "@google_bazel_common//third_party/java/guava",
        "@google_bazel_common//third_party/java/junit",
        "@google_bazel_common//third_party/java/truth:truth8",
    ],
    deps = [
        "//:dagger_with_compiler",
        "@google_bazel_common//third_party/java/auto:value",
        "@google_bazel_common//third_party/java/jsr305_annotations",
    ],
)

GenJavaTests(
    name = "jdk8_tests_with_aot",
    srcs = glob(["**/*.java"]),
    javacopts = DOCLINT_HTML_AND_SYNTAX,
    test_only_deps = [
        "@google_bazel_common//third_party/java/guava",
        "@google_bazel_common//third_party/java/junit",
        "@google_bazel_common//third_party/java/truth:truth8",
    ],
    with_aot = True,
    deps = [
        "//:dagger_with_compiler",
        "@google_bazel_common//third_party/java/auto:value",
        "@google_bazel_common//third_party/java/jsr305_annotations",
    ],
)

# TODO(b/72748365): Add "with aot" tests, once they pass.
