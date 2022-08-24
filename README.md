# Screenshot demo


# Setup 

Ensure [shadow-cljs](https://shadow-cljs.github.io/docs/UsersGuide.html) is installed.

```
npm install --global shadow-cljs
```

Then install the node modules with:

```
npm install
```

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

then you select `shadow-cljs`

afterwards you will be prompted to connect to `:app`

Now, you can evaluate CLJS code in the REPL. 

# Run locally as a standalone script

Ask shadow to compile with:

```
shadow-cljs release prod
```

Run the app with `node`:

```
node out/prod/script.js
```
