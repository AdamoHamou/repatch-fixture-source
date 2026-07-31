# RePatch refactoring-conflict fixture

Minimal scenario for REFACTORING_CONFLICT_TRACKING.md verification:
the source PR renames Fetcher.poll() -> pollRecords() while the fork's
HEAD moved+renamed the same method to ConsumerCoordinator.pollOnce().
Cherry-picking the PR onto the fork conflicts in Fetcher.java, and the
RefMerge matrix flags the refactoring pair (rename vs move+rename of
the same original method).
