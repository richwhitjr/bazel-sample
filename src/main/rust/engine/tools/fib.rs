pub fn fibonacci(n: u32) -> u32 {
    match n {
        0 => n,
        1 => n,
        _ => fibonacci(n - 1) + fibonacci(n - 2),
    }
}