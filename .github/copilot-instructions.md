# Copilot Instructions

## IMPORTANT LINKS - MUST READ FOR COPILOT
[JAVA_DOC_Format.md](../JAVA_DOC_Format.md) - This file defines the standard format for Javadoc comments in this project. 

## Java Good Practices

- Target readability first: prefer clear, intention-revealing names for classes, methods, and variables.
- Keep methods small and focused on a single responsibility.
- Prefer immutability where practical: use `final` for fields, parameters, and locals that do not change.
- Validate method inputs early and fail fast with informative exceptions.
- Handle `null` defensively; use `Optional` only for return types where absence is meaningful.
- Use interfaces and composition over inheritance unless inheritance is clearly the right model.
- Avoid duplicated logic; extract reusable methods/classes when repetition appears.
- Keep classes cohesive: one class should own one well-defined concern.

## Error Handling

- Throw specific exceptions instead of generic `Exception`/`RuntimeException` when possible.
- Never swallow exceptions silently; either handle meaningfully or propagate.
- Include actionable context in exception messages.
- Use `try-with-resources` for all closeable resources.

## Collections and Streams

- Program to interfaces (`List`, `Map`, `Set`) rather than concrete implementations in APIs.
- Prefer enhanced `for` loops for simple iteration; use Streams when they improve clarity.
- Keep stream pipelines simple and readable; avoid over-chaining complex logic.
- Choose appropriate collection types based on required ordering, uniqueness, and lookup characteristics.

## Concurrency and Performance

- Avoid premature optimization; optimize only after identifying bottlenecks.
- Use thread-safe constructs from `java.util.concurrent` instead of manual synchronization when possible.
- Minimize shared mutable state across threads.
- Prefer constants for repeated literal values.

## Documentation

- Document all public and protected classes, interfaces, and methods with Javadoc.
- Follow the format and tag conventions defined in [JAVA_DOC_Format.md](../JAVA_DOC_Format.md).
- Use `{@code}` for inline code references and `{@link}` for cross-references.
- Do not add comments that merely restate the code; document intent and constraints instead.

## Style and Maintainability

- Follow standard Java conventions (PascalCase classes, camelCase members, UPPER_SNAKE_CASE constants).
- Keep visibility as restrictive as possible (`private` by default).
- Add comments only when intent is not obvious from code.
- Keep public APIs stable and backward-compatible unless change is explicitly requested.
- Update tests when behavior changes; do not change behavior without corresponding validation.

## For This Repository

- Keep changes minimal and scoped to the request.
- Preserve existing package structure and naming patterns.
- Avoid introducing new dependencies unless clearly justified.
- Prefer straightforward implementations over clever abstractions.
