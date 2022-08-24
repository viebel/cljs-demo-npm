# Screenshot demo


# Run locally with REPL

On one terminal, let shadow watch the build with:

```
shadow-cljs watch app
```

On another terminal, run the app with `node`:

```
node out/app/script.js
```

Connect your CLJS REPL client to the nrepl port `shadow-cljs` listens to. For instance, in Calva you run the command: 

```
Connect to a running REPL in the current project
```

and then you select `shadow-cljs`

Now, you can evaluate CLJS code in the REPL. 

# Run locally as a standalone script

Ask shadow to compile with:

```
shadow-cljs compile app
```

Run the app with `node`:

```
node out/app/script.js
```
