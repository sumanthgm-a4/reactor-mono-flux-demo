Read these requirements properly before generating content:

Requirements:
- Output RAW markdown only
- GENERATE a result file
- Do not render markdown, put the entire content in ~~~
- Put everything inside one triple-backtick block
- Make it fully copyable
- Include Mermaid diagrams for visualizations wherever I ask for as raw mermaid code
- No explanations outside the block
- Include proper structured hierarchy of blocks within the content using #, ##, ###, etc.
- Do not leave out any of the points mentioned in here, in fact, add more if you feel like, but don't skip on the ones mentioned here

Now parse the below content and generate the markdown content:



Reactor Flux and Mono Demo:

Project Reactor has two core classes: Mono<?> and Flux<?>

[explain a bit about those two, how to create them different ways to create them, contrast Flux<?> with a List<?>]
[explain the methods of Mono and Flux with small examples]
[explain subscribing, cancelling etc, also show how we almost never manually subscribe or cancel, and taht webflux does it for us]
[explain full Subscriber object and methods in it]
[explain streaming, and how to stream using WebFlux]