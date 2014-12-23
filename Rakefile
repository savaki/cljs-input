namespace :cljs do
  desc 'compile the clojurescript code, once'
  task :compile do
    run_command 'lein cljsbuild once prod'
  end

  desc 'continuously compile clojurescript'
  task :watch do
    run_command 'lein cljsbuild auto dev'
  end
end

def run_command(command)
  puts command
  system(command) or raise("unable to execute command, #{command}")
end
