rules_scala_version="63eab9f4d80612e918ba954211f377cc83d27a07" # update this as needed

http_archive(
	name = "io_bazel_rules_scala",
	url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
	type = "zip",
	strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

http_archive(
    name = "io_bazel_rules_rust",
    sha256 = "615639cfd5459fec4b8a5751112be808ab25ba647c4c1953d29bb554ef865da7",
    strip_prefix = "rules_rust-0.0.6",
    urls = [
        "http://bazel-mirror.storage.googleapis.com/github.com/bazelbuild/rules_rust/archive/0.0.6.tar.gz",
        "https://github.com/bazelbuild/rules_rust/archive/0.0.6.tar.gz",
    ],
)

load("@io_bazel_rules_rust//rust:repositories.bzl", "rust_repositories")

rust_repositories()